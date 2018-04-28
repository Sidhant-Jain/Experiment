package challanges;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Security;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class Onmobile_EncryptDcrypt {

			static Cipher ce;
			static Cipher cd;
				
		public static void main(String args[]) throws Exception {
			  SecretKey skey = KeyGenerator.getInstance("DES").generateKey();
			  byte[] initializationVector = new byte[]{0x10, 0x10, 0x01, 0x04, 0x01, 0x01, 0x01, 0x02};
			  AlgorithmParameterSpec algParameters = new IvParameterSpec(initializationVector);
			  ce = Cipher.getInstance("DES/CBC/PKCS5Padding");
			  cd = Cipher.getInstance("DES/CBC/PKCS5Padding");
			  ce.init(Cipher.ENCRYPT_MODE, skey, algParameters);
			  cd.init(Cipher.DECRYPT_MODE, skey, algParameters);
			  FileInputStream is = new FileInputStream("D:/Project_testing/Consumerfirst_details.txt");
			  FileOutputStream os = new FileOutputStream("D:/Project_testing/Consumerfirst_details1.txt");
			  int dataSize = is.available();
			  byte[] inbytes = new byte[dataSize];
			  is.read(inbytes);
			  String str2 = new String(inbytes);
			  System.out.println("Input file contentn" + str2 + "n");
			  write_encode(inbytes, os);
			  os.flush();
			  is.close();
			  os.close();
			  System.out.println("Ecrypted Content to output2.txtn");
			  is = new FileInputStream("D:/Project_testing/Consumerfirst_details1.txt");
			  byte[] decBytes = new byte[dataSize];
			  read_decode(decBytes, is);
			  //os = new FileOutputStream("D:/Project_testing/Consumerfirst_details2.txt");
			  File file = new File("D:/Project_testing/Consumerfirst_details2.txt");
			  FileWriter fileWriter = new FileWriter(file);
			  String str = new String(decBytes);
			  fileWriter.write(str);
			
			  System.out.println("Decrypted file contents:n" + str);
			  os.flush();
			  is.close();
			  os.close();
			  
		 }
			
		 public static void write_encode(byte[] bytes, OutputStream output) throws Exception {
			  CipherOutputStream cOutputStream = new CipherOutputStream(output, ce);
			  cOutputStream.write(bytes, 0, bytes.length);
			  cOutputStream.close();
		}
		 
//		public static void write_final(String str, OutputStream output) throws Exception {
//			  CipherOutputStream cOutputStream = new CipherOutputStream(output, ce);
//			  cOutputStream.write(str, 0, str.length);
//			  cOutputStream.close();
//		}
		 
		public static void read_decode(byte[] bytes, InputStream input) throws Exception {
			  CipherInputStream cInputStream = new CipherInputStream(input, cd);
			  int position = 0, i;
			  while ((i = cInputStream.read()) != -1) {
			  bytes[position] = (byte) i;
			  position++;
		  }
	}
}
