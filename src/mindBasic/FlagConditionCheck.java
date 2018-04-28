package mindBasic;

public class FlagConditionCheck {

	public static void main(String[] args) {
		boolean flag= check();
		System.out.println("final " + flag);
	}
	public static boolean check(){
		boolean flag = false;
		int a=10,b=20;
		if(a<b){
			flag=true;
			System.out.println("condition 1");
		}
		if(a<=b){
			flag = false;
			System.out.println("condition 2");
		}
		if(!flag){
			System.out.println("enter");
		}
		if(flag){
			System.out.println("no entry");
		}
		return flag;
	}
}
