package api.util.date;

import java.util.Date;

public class Test01 {
	public static void main(String [] args) {
	//시간 다루기	
	Date a=new Date();
	Date b=new Date(2022,8,16); //구식
	Date c=new Date(22,7,16); //구식
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}
}
