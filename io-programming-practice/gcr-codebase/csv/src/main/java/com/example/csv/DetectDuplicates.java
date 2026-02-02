package com.example.csv;
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicates {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\bhumi\\Downloads\\csv\\csv\\src\\main\\java\\com\\example\\csv\\student.csv";
        Set<String> ids = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String header = br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String id = line.split(",")[0];
                if (!ids.add(id)) {
                    duplicates.add(line);
                }
            }

            if (!duplicates.isEmpty()) {
                System.out.println("Duplicate records:");
                duplicates.forEach(System.out::println);
            } else {
                System.out.println("No duplicates found.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
