package api.lang.string;

public class Test04 {
	public static void main (String []args) {
		//기타 문자열 명령
		String a="안녕하세요";
		
		System.out.println(a.charAt(0));//=a의 index 글자를 반환
		
		for(int i=0; i<a.length(); i++) {
			char ch= a.charAt(i);
			System.out.println(ch);
		}
		//글자 자르기
		System.out.println(a.substring(1));
		System.out.println(a.substring(2, 4));
		
		//반복
		String b="hello!";
		System.out.println(b.repeat(5));
		
		//치환
		String c="hello!";
		System.out.println(c);
		System.out.println(c.replace("he", "ha"));
		System.out.println(c.replace("he", "**"));
	}
}
