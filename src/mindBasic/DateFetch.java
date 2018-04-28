package mindBasic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.List;

public class DateFetch {

	public static void main(String[] args) {
		String date = dateFind();
		System.out.println(date);
		String[] dateSplit = date.split(" ");
		System.out.println(dateSplit[0]);
		String yesterday_date = dateSplit[0];
		String today_date = dateSplit[1];
		String dateWithTimeStamp = dateWithTimeStamp();
		
		String csvFile = "D:\\system_testing\\Boost\\common_msisdn\\CTA_file\\"+yesterday_date+"\\RobdTest"+yesterday_date+"*/.csv";
		
		
//		for(int i=0; i<dateSplit.length; i++){
//			
//		}
	}
	
	public static String dateFind(){
		DateFormat df = new SimpleDateFormat("ddMMyyyy");
		Date dateObj = new Date();
		
		//System.out.println(df.format(dateObj));
		return df.format(yesterday()) + " " + df.format(dateObj);
	}

	public static Date yesterday(){
		final Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		return cal.getTime();
	}
	
	public static String dateWithTimeStamp(){
		String dateWithTimeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		return dateWithTimeStamp;
	}
}
