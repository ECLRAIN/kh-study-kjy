package api.util.collection3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test03_2 {
	public static void main(String[] args) {
		//저장소 생성
		Map<String, Integer> history = new TreeMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("검색어 : ");
			String keyword = sc.nextLine();
			
			if(keyword.equals("종료")) {
				break;
			}
			
			//int count = 1 or history.get(keyword);
			int count;
			if(history.containsKey(keyword)) {//검색한적이 있으면
				count = history.get(keyword) + 1;
			}
			else {
				count = 1;
			}
			history.put(keyword, count);
			System.out.println("["+keyword+"] 검색이 완료되었습니다. "
												+ "현재 검색횟수 ["+history.get(keyword)+"]");
			
			//System.out.println(history);
		}
		
		sc.close();
		
		System.out.println("프로그램 종료");
		//검색 이력 출력
		
	}
}









