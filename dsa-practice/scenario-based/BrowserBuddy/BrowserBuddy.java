package BrowserBuddy;
import java.util.*;

public class BrowserBuddy {

    static int tabCounter = 1;
    static Tab currentTab = null;

    static Stack<Tab> closedTabs = new Stack<>();
    static List<Tab> openTabs = new ArrayList<>();

    public static void openNewTab() {
        Tab newTab = new Tab(tabCounter++);
        openTabs.add(newTab);
        currentTab = newTab;

        System.out.println("New tab opened: " + currentTab);
    }

    public static void closeCurrentTab() {
        if (currentTab == null) {
            System.out.println("No tab to close.");
            return;
        }

        openTabs.remove(currentTab);
        closedTabs.push(currentTab);

        System.out.println("Closed tab saved for restore: Tab-" + currentTab.tabId);

        currentTab = openTabs.isEmpty() ? null : openTabs.get(openTabs.size() - 1);

        if (currentTab != null)
            System.out.println("Now active: " + currentTab);
        else
            System.out.println("No open tabs left.");
    }

    public static void restoreClosedTab() {
        if (closedTabs.isEmpty()) {
            System.out.println("No closed tabs to restore.");
            return;
        }

        Tab restored = closedTabs.pop();
        openTabs.add(restored);
        currentTab = restored;

        System.out.println("Restored tab: " + restored);
    }

    public static void switchTab(int id) {
        for (Tab t : openTabs) {
            if (t.tabId == id) {
                currentTab = t;
                System.out.println("Switched to: " + currentTab);
                return;
            }
        }
        System.out.println("Tab not found.");
    }

    public static void showTabs() {
        if (openTabs.isEmpty()) {
            System.out.println("No open tabs.");
            return;
        }

        System.out.println("\n Open Tabs:");
        for (Tab t : openTabs) {
            if (t == currentTab)
                System.out.println("6" + t);
            else
                System.out.println("   " + t);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("BrowserBuddy – Tab History Manager");
        System.out.println("-------------------------------------");

        openNewTab(); // default first tab

        while (true) {
            System.out.println("\n1- Open New Tab");
            System.out.println("2- Visit New Page");
            System.out.println("3- Back");
            System.out.println("4- Forward");
            System.out.println("5- Close Current Tab");
            System.out.println("6- Restore Recently Closed Tab");
            System.out.println("7- Switch Tab");
            System.out.println("8- Show Tabs");
            System.out.println("9- Show Current Tab History");
            System.out.println("10- Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    openNewTab();
                    break;

                case 2:
                    if (currentTab == null) {
                        System.out.println("No tab open. Please open a tab first.");
                        break;
                    }
                    System.out.print("Enter URL: ");
                    currentTab.history.visit(sc.nextLine());
                    System.out.println("Opened: " + currentTab.history.getCurrentPage());
                    break;

                case 3:
                    if (currentTab != null) currentTab.history.back();
                    else System.out.println("No active tab.");
                    break;

                case 4:
                    if (currentTab != null) currentTab.history.forward();
                    else System.out.println("No active tab.");
                    break;

                case 5:
                    closeCurrentTab();
                    break;

                case 6:
                    restoreClosedTab();
                    break;

                case 7:
                    System.out.print("Enter tab id: ");
                    switchTab(sc.nextInt());
                    sc.nextLine();
                    break;

                case 8:
                    showTabs();
                    break;

                case 9:
                    if (currentTab != null) currentTab.history.showHistory();
                    else System.out.println("No active tab.");
                    break;

                case 10:
                    System.out.println("BrowserBuddy Closed.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
