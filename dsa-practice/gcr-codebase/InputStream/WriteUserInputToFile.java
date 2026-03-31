package file_reader_input_Stream_reader;

import java.io.*;

public class WriteUserInputToFile {
	public static void main(String[] args) {

		String filePath = "src/file_reader_input_Stream_reader/text.txt";

		//try-with-resources to auto-close all resources
		try (
				//reads byte input from keyboard (System.in)
				InputStreamReader isr = new InputStreamReader(System.in);

				//converts input into character stream & allows line-by-line reading
				BufferedReader br = new BufferedReader(isr);

				//writes characters to a file
				FileWriter fw = new FileWriter(filePath)) {
			
			String input;
			System.out.println("Enter text (type 'exit' to stop):");

			//read user input until "exit" is entered
			while (true) {
				input = br.readLine(); //read user input

				//stop taking input if user types "exit"
				if (input.equalsIgnoreCase("exit")) {
					break;
				}

				//write input to file followed by new line
				fw.write(input + "\n");
			}

			System.out.println("Input successfully written to file.");

		} catch (IOException e) {
			System.out.println("Input or File Error");
		}
	}
}
