package com.example.csv;

import java.io.*;
import java.util.regex.Pattern;

public class ValidateCSV {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\bhumi\\Downloads\\csv\\csv\\src\\main\\java\\com\\example\\csv\\employees.csv";

        //regex patterns
        Pattern emailPattern = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,6}$");
        Pattern phonePattern = Pattern.compile("^\\d{10}$");

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String header = br.readLine();
            System.out.println("Invalid rows:");

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String email = data[2];    // assuming 3rd column is email
                String phone = data[3];    // assuming 4th column is phone

                boolean emailValid = emailPattern.matcher(email).matches();
                boolean phoneValid = phonePattern.matcher(phone).matches();

                if (!emailValid || !phoneValid) {
                    System.out.println(line + " --> Invalid email or phone number");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
