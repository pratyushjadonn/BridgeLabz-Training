package BrowserBuddy;

public class HistoryNode {
    public String url;
    public HistoryNode prev;
    public HistoryNode next;

    public HistoryNode(String url) {
        this.url = url;
    }
}
