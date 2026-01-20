package BrowserBuddy;

public class BrowserHistory {

    private HistoryNode head;
    private HistoryNode current;

    public void visit(String url) {
        HistoryNode newNode = new HistoryNode(url);

        if (head == null) {
            head = newNode;
            current = newNode;
            return;
        }

        // memory efficient: remove forward history
        current.next = null;

        newNode.prev = current;
        current.next = newNode;
        current = newNode;
    }

    public void back() {
        if (current == null || current.prev == null) {
            System.out.println("⚠ No page to go back.");
            return;
        }
        current = current.prev;
        System.out.println("⬅ Back to: " + current.url);
    }

    public void forward() {
        if (current == null || current.next == null) {
            System.out.println("⚠ No page to go forward.");
            return;
        }
        current = current.next;
        System.out.println("➡ Forward to: " + current.url);
    }

    public String getCurrentPage() {
        return (current == null) ? "No Page" : current.url;
    }

    public void showHistory() {
        if (head == null) {
            System.out.println("🚫 No browsing history.");
            return;
        }

        System.out.println("\n📜 Tab History:");
        HistoryNode temp = head;
        while (temp != null) {
            if (temp == current)
                System.out.println("➡ " + temp.url + " (Current)");
            else
                System.out.println("   " + temp.url);
            temp = temp.next;
        }
    }
}
