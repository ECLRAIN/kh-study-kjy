package api.lang.string;

import java.util.Scanner;

public class Test06_5 {
	public static void main(String[] args) {
		//준비
		String[] filter = new String[] {
			"신발", "수박", "시베리아", "십장생", "개나리", 
			"주옥", "조카", "시방", "된장", "십자수"
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String text = sc.nextLine();
		sc.close();
		
		String star = "*";
		
		for(int i=0; i < filter.length; i++) {
			//text = text.replace(filter[i], star.repeat(글자수));
			text = text.replace(filter[i], star.repeat(filter[i].length()));
		}
		System.out.println(text);
	}
}




