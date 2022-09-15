package api.lang.string;

public class Test06_4 {
	public static void main(String[] args) {
		//준비
		String[] filter = new String[] {
			"신발", "수박", "시베리아", "십장생", "개나리", 
			"주옥", "조카", "시방", "된장", "십자수"
		};
		
		String text = "이런 신발끈 개나리같은 수박씨를 보았나";
		
		String star = "*";
		
		for(int i=0; i < filter.length; i++) {
			//text = text.replace(filter[i], star.repeat(글자수));
			text = text.replace(filter[i], star.repeat(filter[i].length()));
		}
		System.out.println(text);
	}
}




