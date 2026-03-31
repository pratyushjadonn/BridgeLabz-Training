package streams;

import java.io.*;

public class ConsoleToFile {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				FileWriter fw = new FileWriter("src/streams/source.txt")) {

			System.out.print("Name: ");
			String name = br.readLine();

			System.out.print("Age: ");
			String age = br.readLine();

			System.out.print("Favorite Language: ");
			String lang = br.readLine();

			fw.write(name + "\n" + age + "\n" + lang);
			System.out.println("Data saved.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
