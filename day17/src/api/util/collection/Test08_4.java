package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test08_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();//인원수(반복횟수)
		sc.nextLine();//엔터 제거
		
		List<String> names = new ArrayList<>();
		
		for(int i=0; i < people; i++) {
			System.out.print("이름 : ");
			names.add(sc.nextLine());
		}
		
		List<String> actions = new ArrayList<>();
		
		for(int i=0; i < people; i++) {
			System.out.print("항목 : ");
			actions.add(sc.nextLine());
		}

		sc.close();
		
		Collections.shuffle(actions);//위치 변경
		
		for(int i=0; i < people; i++) {
			System.out.println(names.get(i) + " -> " + actions.get(i));
		}
	}
}
