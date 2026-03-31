package com.example.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchEmployee {
    public static void main(String[] args) {
        String filePath = "employees.csv";
        String searchName = "Alice";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // skip header
            boolean found = false;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[1].equalsIgnoreCase(searchName)) { //name column
                    System.out.println("Department: " + data[2] + ", Salary: " + data[3]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(searchName + " not found.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
