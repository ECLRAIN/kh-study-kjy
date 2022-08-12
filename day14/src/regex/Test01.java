package regex;

import java.util.regex.Pattern;

public class Test01 {
	public static void main(String []args) {
		//정규 표현식(Regular Expression)
		//옳바른 휴대전화 전화번호인지 검사하시오
		//www.regexper.com
		String phone="010-1234-4567";
	
	String regex="^01[016789]-[123456789][0123456789][0123456789][0123456789]-[0123456789][0123456789][0123456789][0123456789]$";	
	boolean test=Pattern.matches(regex,phone);
	System.out.println("TEST"+test);
	}
}
