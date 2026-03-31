package com.example.csv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LargeCSVReader {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\bhumi\\Downloads\\csv\\csv\\src\\main\\java\\com\\example\\csv\\student.csv";
        int batchSize = 100;
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String header = br.readLine(); // skip header
            String line;
            int batchCount = 0;

            while ((line = br.readLine()) != null) {
                batchCount++;
                count++;

                if (batchCount == batchSize) {
                    System.out.println("Processed " + count + " records...");
                    batchCount = 0;
                }
            }

            System.out.println("Total records processed: " + count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
