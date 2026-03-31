package com.example.csv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class StudentFileReader {
    public static void main(String[] args) {
		String path="C:\\Users\\bhumi\\Downloads\\csv\\csv\\src\\main\\java\\com\\example\\csv\\student.csv";
		try (CSVReader reader=new CSVReader(new FileReader(path))){
			String[] nextLine;
			while((nextLine=reader.readNext())!=null) {
                System.out.println("ID: " + nextLine[0] + ", Name: " + nextLine[1]+",Age: "+nextLine[2]+",Marks: "+nextLine[3]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CsvValidationException e) {
			e.printStackTrace();
		}
		
	}
}



