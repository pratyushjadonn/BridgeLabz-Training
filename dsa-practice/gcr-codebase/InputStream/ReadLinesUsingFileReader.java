package file_reader_input_Stream_reader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class ReadLinesUsingFileReader {
	public static void main(String[] args) {
		String filePath="src/file_reader_input_Stream_reader/data.txt";
		//writing the suspicious code inside try block
		try {
			FileReader fileReader=new FileReader(filePath);
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			String line;
			while((line=bufferedReader.readLine())!=null) {
				System.out.println(line);
			}
		}
		//catch block
		catch(IOException e ){
			System.out.println("File Error");
		}
		
	}
}
