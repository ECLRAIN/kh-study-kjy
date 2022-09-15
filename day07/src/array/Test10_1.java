package array;

import java.util.Random;
import java.util.Scanner;

public class Test10_1 {
	public static void main(String[] args) {
		
		//크기 설정
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 개수 : ");
		int size = sc.nextInt();
		
		//배열 생성
		String[] menu = new String[size];
		//menu.length == size
		
		//입력
		for(int i=0; i < size; i++) {//size번 반복
			System.out.print("메뉴 입력 : ");
			menu[i] = sc.next();
		}
		sc.close();
		
		//랜덤위치 생성
		Random r = new Random();
		int index = r.nextInt(size);//0부터 size개;
		//System.out.println("index = " + index);
		
		//출력
		System.out.println("오늘 점심은 " + menu[index] + "(으)로 갑시다!");
		
	}
}








