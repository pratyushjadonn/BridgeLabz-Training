package com.example.csv;
import java.io.*;
import java.util.*;

public class TopPaidEmployees {
    public static void main(String[] args) {
        String filePath = "employees.csv";
        List<String[]> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String header = br.readLine(); // skip header
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                employees.add(data);
            }

            // Sort by salary descending
            employees.sort((a, b) -> Integer.parseInt(b[3]) - Integer.parseInt(a[3]));

            System.out.println("Top 5 highest-paid employees:");
            for (int i = 0; i < Math.min(5, employees.size()); i++) {
                System.out.println(Arrays.toString(employees.get(i)));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

