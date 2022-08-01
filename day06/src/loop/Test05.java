package loop;
import java.util.Scanner;
public class Test05 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		do {
		System.out.println("점수: ");
		score = sc.nextInt();
		}
		while(score<0 || score>100);
		sc.close();
	}
}
