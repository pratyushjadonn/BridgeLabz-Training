package streams;

import java.io.*;

public class BufferedVsUnbuffered {
	public static void main(String[] args) throws Exception {

		byte[] buffer = new byte[4096];

		long start1 = System.nanoTime();
		try (FileInputStream fis = new FileInputStream("src/streams/source.txt");
				FileOutputStream fos = new FileOutputStream("src/streams/dest.txt")) {

			int bytes;
			while ((bytes = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, bytes);
			}
		}
		long end1 = System.nanoTime();

		long start2 = System.nanoTime();
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/streams/source.txt"));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/streams/dest.txt"))) {

			int bytes;
			while ((bytes = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, bytes);
			}
		}
		long end2 = System.nanoTime();

		System.out.println("Unbuffered Time: " + (end1 - start1));
		System.out.println("Buffered Time: " + (end2 - start2));
	}
}
