package Inheritance;

public class SchoolSystem {
  public static void main(String[]args) {
	  Teacher t = new Teacher("Anita", 35, "Mathematics");
      Student s = new Student("Rohit", 16, "10th Grade");
      Staff st = new Staff("Suresh", 42, "Administration");

      t.displayRole();
      s.displayRole();
      st.displayRole();
  }
}
