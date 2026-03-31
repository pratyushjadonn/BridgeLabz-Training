package com.example.csv;
import java.io.*;
import java.util.Base64;

public class CSVEncryptDecrypt {
    public static void main(String[] args) throws IOException {
        String inputFile = "employees.csv";
        String encryptedFile = "employees_enc.csv";

        // Encrypt Salary column (4th column)
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(encryptedFile))) {

            String header = br.readLine();
            bw.write(header + "\n");
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String salaryEnc = Base64.getEncoder().encodeToString(data[3].getBytes());
                data[3] = salaryEnc;
                bw.write(String.join(",", data) + "\n");
            }
        }

        // Decrypt
        try (BufferedReader br = new BufferedReader(new FileReader(encryptedFile))) {
            String header = br.readLine();
            System.out.println(header);
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String salaryDec = new String(Base64.getDecoder().decode(data[3]));
                data[3] = salaryDec;
                System.out.println(String.join(",", data));
            }
        }
    }
}
