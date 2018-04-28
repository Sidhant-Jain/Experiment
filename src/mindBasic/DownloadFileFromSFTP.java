package mindBasic;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.SocketException;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

import java.util.Properties;

public class DownloadFileFromSFTP {

	public static void main(String[] args) throws SocketException, JSchException, SftpException {
		String ip = "10.91.12.40";
		int port =123;
		String username = "boost";
		String password ="B00st#123";
		String sftpPath ="/opt/esp/bifiles/bifiles/";
		
		Session session = null;
		Channel channel = null;
		ChannelSftp channelSftp = null;
		Properties properties;
		
		try{
			JSch jsch = new JSch();
			session = jsch.getSession(username, ip, port);
			session.setPassword(password);
//			 properties = new Properties();
//			 properties.put("StrictHostKeyChecking", "no");
//			 session.setConfig(properties);
			 session.connect();
			 channel = session.openChannel("sftp");
			 channel.connect();
			 channelSftp = (ChannelSftp) channel;
			 channelSftp.cd(sftpPath);
			 byte[] buffer = new byte[1024];
			 BufferedInputStream bis = new BufferedInputStream(channelSftp.get("session09.txt"));
			 File file = new File("/tmp/sid/session09.txt");
			 OutputStream os = new FileOutputStream(file);
			 BufferedOutputStream bos = new BufferedOutputStream(os);
			 int readCount;
			 while((readCount=bis.read(buffer))>0){
				 System.out.println("likh ra h");
				 bos.write(buffer,0,readCount);
			 }
			 bis.close();
			 bos.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		
	}

}
