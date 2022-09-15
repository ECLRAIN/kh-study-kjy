package api.lang.string;

public class Test06_1 {
	public static void main(String[] args) {
		
		//준비
		String text = "이런 신발끈 개나리같은 수박씨를 보았나";
		
		System.out.println(text);
		System.out.println(text.replace("신발", "***"));
		System.out.println(text.replace("개나리", "***"));
		
		System.out.println(text.replace("신발", "***").replace("개나리", "***"));
		
		text = text.replace("신발", "***");
		text = text.replace("개나리", "***");
		System.out.println(text);
	}
}




