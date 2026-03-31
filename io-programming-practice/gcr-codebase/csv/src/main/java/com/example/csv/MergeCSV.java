package com.example.csv;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MergeCSV {
    public static void main(String[] args) {
        String file1 = "C:\\Users\\bhumi\\Downloads\\csv\\csv\\src\\main\\java\\com\\example\\csv\\student1.csv"; // ID, Name, Age
        String file2 = "C:\\Users\\bhumi\\Downloads\\csv\\csv\\src\\main\\java\\com\\example\\csv\\student2.csv"; // ID, Marks, Grade
        String outputFile = "C:\\Users\\bhumi\\Downloads\\csv\\csv\\src\\main\\java\\com\\example\\csv\\merged.csv";

        try (BufferedReader br1 = new BufferedReader(new FileReader(file1));
             BufferedReader br2 = new BufferedReader(new FileReader(file2));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            //read second file into a map
            Map<String, String[]> map = new HashMap<>();
            String header1 = br1.readLine();
            String header2 = br2.readLine();
            bw.write(header1 + "," + header2.substring(3) + "\n"); // merge headers

            String line;
            while ((line = br2.readLine()) != null) {
                String[] data = line.split(",");
                map.put(data[0], new String[]{data[1], data[2]}); // ID -> Marks, Grade
            }

            //merge
            while ((line = br1.readLine()) != null) {
                String[] data = line.split(",");
                if (map.containsKey(data[0])) {
                    String[] extra = map.get(data[0]);
                    bw.write(String.join(",", data) + "," + String.join(",", extra) + "\n");
                }
            }

            System.out.println("Merged CSV created: " + outputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
