package mindBasic;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
//import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/**
 * @author sidhant.jain
 */

public class CheckProxyNdDivertServer {

	public static void main(String[] args) throws IOException {
		InetSocketAddress proxyInet = new InetSocketAddress("10.91.12.40",123);
		Proxy proxy = new Proxy(Proxy.Type.HTTP, proxyInet);
		
		URL httpsUrl = new URL("https://10.89.46.25:8080/test");
		HttpsURLConnection httpsCon = (HttpsURLConnection) httpsUrl.openConnection(proxy);
		
		httpsCon.setDoOutput(true);
		httpsCon.setDoInput(true);
		httpsCon.setRequestMethod("POST");
		OutputStream out = httpsCon.getOutputStream();
		OutputStreamWriter oWriter = new OutputStreamWriter(out);
		
		oWriter.write("<request>test</request>");
		oWriter.flush();
		oWriter.close();
	}

}
