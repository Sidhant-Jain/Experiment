package challanges;

/*One of our client deals with different brands of computers (HP, Sony, Lenovo, Dell, Apple etc.) 
•	Following are the client requirements related to the computer inventory:
•	 1. List all the computers which are of pink color?
•	 2. List all the computers which are of black color and having price less than 75,000?
•	 3. List all the 14 inch computers which are of blue color and having price higher than 85,000?       
*/

import java.util.ArrayList;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;

public class TrainingProg1 {

	public static void main(String[] args) {
		
		ArrayList<Laptop> al1 = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		String line="";
		try{
			FileReader fr=new FileReader(str);
			BufferedReader br=new BufferedReader(fr);
			int count=0;
			
			while((line =br.readLine()) != null){
				String a[] = line.split(",");
				if(count > 0){
					//TrainingProg1 trp1 = new TrainingProg1(a[0], a[1], Integer.parseInt(a[2]));
					Laptop lp =  new Laptop(a[0], a[1], Integer.parseInt(a[2]));
					al1.add(lp);
					System.out.println(al1);
				}
				else{
					count++;
				}
			}
		}catch(Exception e){
			
		}
	}
}


class Laptop{
	String name;
	String color;
	int price;
	
	Laptop(String name, String color, int price){
		System.out.println("name : " + name + "color: " + color + "price : " + price );
		this.name = name;
		this.color = color;
		this.price = price;
	}
}

