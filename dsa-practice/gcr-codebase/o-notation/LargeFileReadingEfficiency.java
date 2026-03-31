package runtime_analysis_big_o_notation;
import java.io.*;
public class LargeFileReadingEfficiency {
    public static void main(String[] args) {
        String filePath = "src/runtime_analysis_big_o_notation/largeFile.txt";
        //fileReader timing
        long startTime = System.nanoTime();
        readUsingFileReader(filePath);
        long endTime = System.nanoTime();
        long fileReaderTime = endTime - startTime;
        System.out.println("Time taken by FileReader: "+ fileReaderTime/1000000.0 + " ms");
        //inputStreamReader timing
        startTime = System.nanoTime();
        readUsingInputStreamReader(filePath);
        endTime = System.nanoTime();
        long inputStreamReaderTime = endTime - startTime;
        System.out.println("Time taken by InputStreamReader: "+ inputStreamReaderTime / 1_000_000.0 + " ms");
    }

    //reading using FileReader (Character Stream)
    public static void readUsingFileReader(String filePath) {
        try (FileReader fr = new FileReader(filePath)) {
            while (fr.read() != -1) {
                //reading character by character
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //reading using InputStreamReader (Byte Stream)
    public static void readUsingInputStreamReader(String filePath) {
        try (InputStreamReader isr =
                     new InputStreamReader(new FileInputStream(filePath))) {
            while (isr.read() != -1) {
                //reading byte-converted characters
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
