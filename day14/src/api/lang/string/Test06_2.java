package api.lang.string;

public class Test06_2 {
	public static void main(String[] args) {
		//준비
		String[] filter = new String[] {
			"신발", "개나리"
		};
		
		String text = "이런 신발끈 개나리같은 수박씨를 보았나";
		
		System.out.println(text);
		System.out.println(text.replace(filter[0], "***"));
		System.out.println(text.replace(filter[1], "***"));
		
		System.out.println(text.replace(filter[0], "***").replace(filter[1], "***"));
		
		text = text.replace(filter[0], "***");
		text = text.replace(filter[1], "***");
		System.out.println(text);
	}
}




