package mindBasic;

public class SubStringFinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="http://172.19.113.40:8181/swami/profile/getProfile";
		String str1[] = str.split(":");
		System.out.println(str1[1]);
		
		
		String serverIp = str1[1].substring(2);
		System.out.println(serverIp);
	}

}
