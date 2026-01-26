package streams;

import java.io.*;

public class DataStreamExample {
	public static void main(String[] args) throws IOException {

		DataOutputStream dos = new DataOutputStream(new FileOutputStream("student.dat"));

		dos.writeInt(101);
		dos.writeUTF("Ravi");
		dos.writeDouble(8.6);
		dos.close();

		DataInputStream dis = new DataInputStream(new FileInputStream("student.dat"));

		System.out.println(dis.readInt());
		System.out.println(dis.readUTF());
		System.out.println(dis.readDouble());
		dis.close();
	}
}
