package mindBasic;

public class EnumTest {

		enum Day{SUNDAY, MONDAY, TUESDAY, WEDNESDAY, Thrusday, friday}
		public static void main(String[] args) {
			for(Day d : Day.values()){
				System.out.println(d);
			}
	}

}
