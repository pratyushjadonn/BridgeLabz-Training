package com.example.csv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVCount {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\bhumi\\Downloads\\csv\\csv\\src\\main\\java\\com\\example\\csv\\employees.csv"; //path to your CSV file
        int rowCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    isHeader = false; //skip header
                    continue;
                }
                rowCount++; //count each row
            }

            System.out.println("Number of records (excluding header): " + rowCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
