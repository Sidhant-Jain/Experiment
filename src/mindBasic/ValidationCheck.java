package mindBasic;

public class ValidationCheck {
	public static void main(String[] args){
		String msisdn = "9986718jkg277";
		try{
			boolean b = validate(msisdn);
			System.out.println(b);
		}
		catch(Exception ex){
			System.out.println("fail");
		}

	}
	
	public static boolean validate(String msisdn) throws Exception{

		try {
			Long.parseLong(msisdn.toString());
		} catch (Exception e) {
			throw new Exception(String.format("'%s' should be a number!", msisdn));
		}
		return true;	
	}
	
	
}
