package mindBasic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializeSerFile {

	public static void main(String[] args) throws IOException{
		DeserializeSerFile dsf = new DeserializeSerFile();
		ArrayList<String> al = dsf.deserializeObject("D:\\system_testing\\Boost\\file.ser");
		System.out.println("done");
		System.out.println(al);
	}
	
	public  ArrayList<String> deserializeObject(String fileName) throws IOException{
		ArrayList<String> arr = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try{
			fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);
			arr = (ArrayList<String>) ois.readObject();
		}
		catch(FileNotFoundException io){
			io.printStackTrace();
		}
		catch(ClassNotFoundException cnf){
			cnf.printStackTrace();
		}
		finally{
			if(fis != null){
				fis.close();
			}
			if(ois != null){
				ois.close();
			}
		}
		return arr;
	}
}
