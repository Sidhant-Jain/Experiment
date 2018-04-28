package challanges;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PaypalAltimetrik {

	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String str[] = dateFormat.format(date).split("/");		
	}

}
