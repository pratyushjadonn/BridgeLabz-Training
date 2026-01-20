package BrowserBuddy;

public class Tab {
    public int tabId;
    public BrowserHistory history;

    public Tab(int tabId) {
        this.tabId = tabId;
        this.history = new BrowserHistory();
        history.visit("Home Page");
    }

    public String toString() {
        return "Tab-" + tabId + " | Current Page: " + history.getCurrentPage();
    }
}
