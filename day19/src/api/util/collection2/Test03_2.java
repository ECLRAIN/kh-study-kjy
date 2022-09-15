package api.util.collection2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test03_2 {
	public static void main(String[] args) {
		
		Set<Integer> like = new TreeSet<>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("번호 : ");
			int number = sc.nextInt();
			if(number == 0) {//0을 입력하면 종료되도록 처리(가장 먼저 검사)
				break;
			}
		
//			if(number가 이미 있다면) {
			if(like.contains(number)) {
				like.remove(number);
				System.out.println(number+" 번호 게시글에 좋아요를 취소했습니다");
			}
			else {
				like.add(number);
				System.out.println(number+" 번호 게시글에 좋아요를 눌렀습니다");
			}
		}
		
		sc.close();
	}
}









