package functional_interface;
interface ReportExporter {

    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Exporting report to JSON format (default)");
    }
}

class SalesReport implements ReportExporter {

    public void exportToCSV() {
        System.out.println("Sales report exported as CSV");
    }

    public void exportToPDF() {
        System.out.println("Sales report exported as PDF");
    }
}

public class ReportApp {
    public static void main(String[] args) {

        ReportExporter report = new SalesReport();
        report.exportToJSON();
    }
}
