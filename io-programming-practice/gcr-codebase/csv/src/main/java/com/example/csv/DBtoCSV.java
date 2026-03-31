package com.example.csv;
import java.io.*;
import java.sql.*;

public class DBtoCSV {
    public static void main(String[] args) {
        String outputFile = "C:\\Users\\bhumi\\Downloads\\csv\\csv\\src\\main\\java\\com\\example\\csv\\employee_report.csv";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhumika2004", "bhumika", "12345");
             Statement stmt = conn.createStatement();
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            ResultSet rs = stmt.executeQuery("SELECT id, name, department, salary FROM employees");
            bw.write("Employee ID,Name,Department,Salary\n");

            while (rs.next()) {
                bw.write(rs.getInt("id") + "," +
                        rs.getString("name") + "," +
                        rs.getString("department") + "," +
                        rs.getDouble("salary") + "\n");
            }

            System.out.println("CSV report generated: " + outputFile);

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
