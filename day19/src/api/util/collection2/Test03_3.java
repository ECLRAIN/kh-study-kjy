package api.util.collection2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test03_3 {
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
		
		//목록 출력
		System.out.println(like);
		
		//개별 접근은 불가능하지만 전체를 다 추출하는 것은 가능하다
		//1. Iterator라는 별개의 저장소로 이동
		Iterator<Integer> iter = like.iterator();
		while(iter.hasNext()) {
			int number = iter.next();
			System.out.println(number);
		}
		
		//2. 확장형 for 구문을 사용
		//for(like에 있는 데이터 개수만큼 몽땅) {
		for(int number : like) {
			System.out.println(number);
		}
		
		//3. 배열로 복사하거나 List로 복사(비추천)
	}
}









