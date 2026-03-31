package com.example.csv;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\bhumi\\Downloads\\csv\\csv\\src\\main\\java\\com\\example\\csv\\employees.csv"; //CSV file name

        //data to write
        String[][] employees = {
            {"1", "Alice", "HR", "50000"},
            {"2", "Bob", "Finance", "60000"},
            {"3", "Charlie", "IT", "70000"},
            {"4", "Diana", "Marketing", "55000"},
            {"5", "Ethan", "Sales", "52000"}
        };

        try (FileWriter writer = new FileWriter(filePath)) {
            //write header
            writer.append("ID,Name,Department,Salary\n");

            //write employee records
            for (String[] emp : employees) {
                writer.append(String.join(",", emp)); // join array elements with comma
                writer.append("\n");
            }

            System.out.println("CSV file created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
