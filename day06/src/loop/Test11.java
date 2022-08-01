package loop;
import java.util.Random;
public class Test11 {
	public static void main(String [] args) {
		Random r= new Random();
		int count=0;
		//주사위 2개
		while(true) {
		int a= r.nextInt(6)+1;
		int b= r.nextInt(6)+1;
		
		System.out.println(a+"+"+b);
		count++;
		if((a==5 && b==5) ||(a==6 && b==6)) {
			break;
		}
		}
		System.out.println(count+"번 던졌다");
	}
}
