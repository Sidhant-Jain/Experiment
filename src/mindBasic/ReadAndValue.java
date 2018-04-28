package mindBasic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.HashMap;

public class ReadAndValue {

	public static void main(String[] args) {
		String file = "D:/mail/sudhir/operator_content_aggregate_download_201608.csv";
		String file1 = "D:/mail/sudhir/out.txt";
		HashMap<String,String> hp= new HashMap<String,String>();
		String line= null;
		String str="";
		int i=0;
		
		try{
			FileReader fr = new FileReader(file);
			FileOutputStream fos = new FileOutputStream(file1);
			BufferedReader br = new BufferedReader(fr);
			PrintStream printStream = new PrintStream(fos);
			
			while((line = br.readLine()) != null){
				String a[] = line.split(",");
				if(!(str.equals(a[i]))){
					if(!((hp.size()-1) == -1) && !((hp.size()-1) == 0)){
						System.setOut(printStream);
						System.out.println(str + " " + (hp.size()-1));
					}
				}
				int j =0;
				str=a[j];
				hp.put(a[j+1], a[j]);
			}
			System.out.println(str + " " + (hp.size()-1));
		}
		catch(FileNotFoundException fe){
			System.out.println("");
		}
		catch(Exception e){
			System.out.println("Exception");
		}
	}

}
