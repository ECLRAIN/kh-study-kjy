package loop;
import java.util.Random;
import java.util.Scanner;
public class work2 {
	public static void main(String [] args) {
		Random r= new Random();
		Scanner sc= new Scanner(System.in);
		
		int Level=0;
		int total=0; //몇번만에 
		while(true) {
		int range = r.nextInt(100)+1;
		System.out.println(range);
		if(range<=25) {
		System.out.println("성공");
		Level++;
		if(Level==15) {
			break;
		}
		}
		else if(26<=range && range<=75) {
		System.out.println("현상유지");
		
		}
		else {
		System.out.println("실패");	
		Level--;
		
			
		}
		total++;
		}
		System.out.println(Level+"레벨을"+total+"번 만에 성공했습니다");
		}
	}	

