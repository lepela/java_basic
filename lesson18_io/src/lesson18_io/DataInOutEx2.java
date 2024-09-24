package lesson18_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInOutEx2 {
	public static void main(String[] args) throws Exception{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("원주율2.txt"));
		dos.writeBoolean(true); // 1
		dos.writeLong(10); // 8
		dos.writeChar('가'); // AC00 // 2
		dos.writeChar('a'); // 0061 // 2 13
		dos.writeChars("가a"); // 4 17
		dos.writeUTF("가a"); // 4 21
		
		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("원주율2.txt"));
//		int d = dis.readInt();
		System.out.println(dis.read()); // 1
		System.out.println(dis.readInt()); // 0
		System.out.println(dis.readInt()); // 10
		System.out.println(dis.readShort()); // 10
		
		dis.close();
		
	}
}
