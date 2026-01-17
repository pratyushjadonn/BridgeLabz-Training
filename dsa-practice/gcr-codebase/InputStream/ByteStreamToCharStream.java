package file_reader_input_Stream_reader;
import java.io.*;
public class ByteStreamToCharStream {
	public static void main(String[] args) {
		String filePath = "src/file_reader_input_Stream_reader/data.txt";
		//try-with-resources is used to automatically close the resources
        try (
            //reads raw binary (byte) data from the file
            FileInputStream fis = new FileInputStream(filePath);
            //converts byte stream into character stream using UTF-8 encoding
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            //reads characters efficiently line by line
            BufferedReader br = new BufferedReader(isr)
        ) {
            String line;
            //read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } 
        catch (IOException e) {
        	//handles file not found, read error, or encoding issues
            System.out.println("File or Encoding Error");
        }
	}
}
