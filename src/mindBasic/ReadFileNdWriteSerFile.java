package mindBasic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class ReadFileNdWriteSerFile {

	public static void main(String[] args) throws IOException {
		ReadFileNdWriteSerFile rfws = new ReadFileNdWriteSerFile();
		Properties prop = new Properties();
		ArrayList<String> al = new ArrayList<>();
		InputStream input = null;
		Enumeration enu = null;
		
		input = new FileInputStream("D:\\system_testing\\Boost\\config1.properties");
		prop.load(input);
		enu = prop.keys();
		
		while(enu.hasMoreElements()){
			String key = (String)enu.nextElement();
			if(key.equalsIgnoreCase("WHITELISTEDIPS") || key.equalsIgnoreCase("TO_MAILS") || key.equalsIgnoreCase("ESP_API")){
//				System.out.println(key);
			}
			else{
				al.add(key);
			}
		}
		System.out.println(al);		
		
		rfws.serializeObject(al);
	}

	public void serializeObject(ArrayList<String> al) throws IOException{
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try{
			fos= new FileOutputStream("D:\\system_testing\\Boost\\file.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			System.out.println("done");
			
		}
		catch(FileNotFoundException fnf){
			fnf.printStackTrace();
		}
		finally{
			if(fos != null){
					fos.close();
			}
			if(oos != null){
				oos.close();
			}
		}
	}
}
