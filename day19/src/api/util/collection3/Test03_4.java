package api.util.collection3;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test03_4 {
	public static void main(String[] args) throws IOException {
		//저장소 생성
		Map<String, Integer> history = new TreeMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=";
		
		while(true) {
			System.out.print("검색어 : ");
			String keyword = sc.nextLine();
			keyword = keyword.toLowerCase();//소문자 변환
//			keyword = keyword.trim();//좌우 불필요한 여백 제거
			keyword = keyword.replace(" ", "");//공백 제거
			
			if(keyword.equals("종료")) {
				break;
			}
			
			Runtime.getRuntime().exec("cmd /c start /b \"\" \""+url+keyword+"\"");//Windows
//			Runtime.getRuntime().exec("open \""+url+keyword+"\"");//mac
			
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









