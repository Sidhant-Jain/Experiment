package mindBasic;

import java.io.IOException;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTPClient;

public class FtpFileTransferUsingProxy {

	public static void main(String[] args) throws SocketException, IOException {
//		FTPClient ftpClient = FTPClient();
		FTPClient ftpClient = new FTPClient();
		ftpClient.connect("10.91.12.40", 123);
		ftpClient.login("boost", "B00st#123");
		
		ftpClient.connect("10.89.46.25", 22);
		ftpClient.login("bi", "onmobile");
		
		
	}

}
