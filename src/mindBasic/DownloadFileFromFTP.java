package mindBasic;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
//import java.net.SocketException;
import java.net.SocketException;

//import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

public class DownloadFileFromFTP {

	public static void main(String[] args){
		System.out.println("ha ji");
		String ip = "10.9.11.16"; 
        int port = 21; 
        String username = "onmobile";
        String password = "qwerty12#"; 
        String remoteFilePath = "/bi/SID/test/session_09.txt";
        FTPClient ftpClient = new FTPClient();
        try{
            try {
				ftpClient.connect(ip, port);
			} catch (Exception e) {
				System.out.println("28 e " + e.toString());
				e.printStackTrace();
			}
    		boolean login = ftpClient.login(username, password);
    		System.out.println(login);
    		System.out.println("rchd");
    		ftpClient.enterLocalPassiveMode();
 //   		ftpClient.setFileType(FTP.COMPRESSED_TRANSFER_MODE);

    		File localFilePath = new File("D:\\system_testing\\Boost\\session_09.txt");
    		OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(localFilePath));
    		
    		boolean sucess = ftpClient.retrieveFile(remoteFilePath, outputStream);
    		outputStream.close();
        	
        }catch(SocketException se){
        	System.out.println("Exception se " + se.toString());
        	se.printStackTrace();
        }catch(IOException ioe){
        	System.out.println("Exception ioe " + ioe.toString());
        	ioe.printStackTrace();
        }catch(Exception e){
        	System.out.println("Exception e " + e.toString());
        	e.printStackTrace();
        }
        
        finally{
        	System.out.println("finally");
        	try{
        		if(ftpClient.isConnected()){
            		ftpClient.logout();
            		ftpClient.disconnect();
        		}
        	}catch(IOException ioe){
        		ioe.printStackTrace();
        	}
        }
	}

}
