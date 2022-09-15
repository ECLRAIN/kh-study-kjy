package random;

import java.util.Random;

public class Test03 {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int a = r.nextInt(8) + 2;
		int b = r.nextInt(9) + 1;
		
		System.out.print(a + " x " + b + " = ");
		
	}
}
 