package com.example.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterHighScores {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\bhumi\\Downloads\\csv\\csv\\src\\main\\java\\com\\example\\csv\\student.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // skip header
            System.out.println("Students with marks > 80:");
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int marks = Integer.parseInt(data[2]); // assuming 3rd column is marks
                if (marks > 80) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
