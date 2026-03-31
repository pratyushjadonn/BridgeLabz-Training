package file_reader_input_Stream_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountOccurrenceOfAWordInAFile {
	public static void main(String[] args) {
		String filePath="src/file_reader_input_Stream_reader/data.txt";
		String word="is";
		int count=0;
		//writing the suspicious code inside try block
		try {
			FileReader fileReader=new FileReader(filePath);
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			String line;
			while((line=bufferedReader.readLine())!=null) {
				String[] words=line.split(" ");
				for(String str:words) {
					if(str.equals(word)) count++;
				}
			}
			System.out.println("Count of "+word +" in the file is : "+count);
		}
		//catch block
		catch(IOException e ){
			System.out.println("File Error");
		}
	}
}
