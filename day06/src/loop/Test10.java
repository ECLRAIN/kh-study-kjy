package loop;

import java.util.Random;

public class Test10 {
	public static void main(String [] args) {
		Random r= new Random();
		int oddcount=0 , evencount=0; 
		
		for(int i=0; i<100 ; i++) {
		int dice= r.nextInt(6)+1;
		System.out.println(dice);
		
		if(dice%2 !=0){
			oddcount++;
		}
		else {
			evencount++;
		}
		}
	}
}
