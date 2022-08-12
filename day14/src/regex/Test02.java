package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test02 {
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("ID: ");
		String user=sc.next();
		
		String regex="^[a-z][a-z0-9]{7,19}";
		boolean test=Pattern.matches(regex, user);
		System.out.println(test);
	}
}
