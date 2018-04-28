package mindBasic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;


public class EncrptDcrypt {
	
	static String str1;
	static String str2;
	
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("D:/Project_testing/Consumerfirst_details.txt");
		int dataSize = fis.available();
		byte[] inbytes = new byte[dataSize];
		fis.read(inbytes);
		String str2 = new String(inbytes);
		System.out.println(str2);
		write_encode(inbytes);
	}
	
	 public static void write_encode(byte[] bytes) throws Exception {
		 FileOutputStream fos = new FileOutputStream("D:/Project_testing/Consumerfirst_details1.txt");
		 	fos.write(bytes, 0, bytes.length);
		 
	}
}

