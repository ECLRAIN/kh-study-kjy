package loop;

//import java.lang.*;
import java.util.Scanner;

public class Test14_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단수 : ");
		int dan = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.print(dan + " X " + i + " = ");
			int user = sc.nextInt();
		}
		
		sc.close();
	}
}