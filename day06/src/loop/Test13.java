package loop;
import java.util.Random;
import java.util.Scanner;

public class Test13 {
	public static void main(String [] args) {
		Random r= new Random();
		Scanner sc= new Scanner(System.in);
		
		int range = r.nextInt(100)+1;
		System.out.println(range);
		if(range<=30) { //5%임
			System.out.println("당첨");
		}
		else {System.out.println("꽝");
	}
}
}