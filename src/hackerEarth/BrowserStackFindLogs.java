package hackerEarth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BrowserStackFindLogs {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String find1="GET";
		int count=0;
		
		while(br.readLine() != null){
//			System.out.println("reached");
			Pattern p = Pattern.compile(find1);
			Matcher m = p.matcher(br.readLine());
			if(m.find()){
				count++;
			}
			System.out.println(br.readLine());
			System.out.println(count);
		}
		
	}
}
