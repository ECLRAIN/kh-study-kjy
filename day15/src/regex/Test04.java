package regex;

import java.util.regex.Pattern;

public class Test04 {
	public static void main(String[] args) {
		
		String date = "2020-02-29";
		
		//String regex = "^(19[0-9]{2}|20[0-9]{2})-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[01])$";
		String regex = "^(19[0-9]{2}|20[0-9]{2})-(02-(0[1-9]|1[0-9]|2[0-8])|(0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30)|(0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))$";
		
		boolean result = Pattern.matches(regex, date);
		
		System.out.println("result = " +result);
	}
}
