package keywords;

public class Patient {
    // Static variable for hospital name
    private static String hospitalName = "City Hospital";
    // Static variable to count total patients
    private static int totalPatients = 0;
    // Final variable for patient ID
    private final String patientID;
    // Instance variables
    private String name;
    private int age;
    private String ailment;
    // Constructor using 'this'
    public Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }
    // Static method to get total patients
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }
    // Method to display patient details using instanceof
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Invalid Patient Object");
        }
    }

    // Main method
    public static void main(String[] args) {
        // Display total patients
        Patient.getTotalPatients();
        // Create patient instances
        Patient patient1 = new Patient("P001", "Lathika", 30, "Flu");
        Patient patient2 = new Patient("P002", "Lidiya", 45, "Fracture");
        // Display patient details
        patient1.displayPatientDetails();
        patient2.displayPatientDetails();
    }
    
}