package com.example.csv;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UpdateITSalary {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\bhumi\\Downloads\\csv\\csv\\src\\main\\java\\com\\example\\csv\\employees.csv";
        String outputFile = "C:\\Users\\bhumi\\Downloads\\csv\\csv\\src\\main\\java\\com\\example\\csv\\employees_updated.csv";

        List<String> updatedLines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String header = br.readLine();
            updatedLines.add(header);

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[2].equalsIgnoreCase("IT")) { // Department
                    double salary = Double.parseDouble(data[3]);
                    salary *= 1.1; // increase by 10%
                    data[3] = String.valueOf((int) salary); // update salary
                }
                updatedLines.add(String.join(",", data));
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
                for (String l : updatedLines) {
                    bw.write(l);
                    bw.newLine();
                }
            }

            System.out.println("Updated CSV saved as " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
