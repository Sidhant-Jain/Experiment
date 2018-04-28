package arrayProblem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadingFileOnMaking {

	private static final String UPLOAD_FOLDER = "D:\\Download";

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try{
			File file = new File("D:\\Download\\text1.txt");
			byte[] bFile = new byte[(int) file.length()];
			
			fis = new FileInputStream(file);
			fis.read(bFile);
			
			writeBytesToFile(bFile, UPLOAD_FOLDER + "test2.txt");
			
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			if(fis != null){
				try {
					fis.close();
				}
				catch(IOException e){
					e.printStackTrace();
				}
			}
		}
		
	}
	
	private static void writeBytesToFile(byte[] bFile, String fileDestination){
		
		try(FileOutputStream fos = new FileOutputStream(fileDestination)){
			fos.write(bFile);
		}
		catch(IOException e){
			e.printStackTrace();
		}
				
		
	}


}



