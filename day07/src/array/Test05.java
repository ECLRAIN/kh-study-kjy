package array;

public class Test05 {
	public static void main(String[] args) {

		//성적 데이터 준비
		int[] score = new int[]{75, 92, 86, 65, 79, 95, 88, 86, 72, 77};

		//성적 출력
		for(int i=0; i < score.length; i++) {
			System.out.println("점수 = " + score[i]);
		}

		System.out.println("---------------");

		//평균 출력
		int total = 0;
		for(int i=0; i < score.length; i++) {
			total += score[i];
		}

		double avg = (double)total/score.length;
		System.out.println("평균 = " + avg);

		System.out.println("---------------");
		//성적 우수자(90점 이상) 출력
		int count = 0;
		for(int i=0; i < score.length; i++) {
			if(score[i] >= 90) {
				//System.out.println("점수 = " + score[i]);
				count++;
			}
		}
		System.out.println("성적 우수자 : "+ count+"명");

		System.out.println("---------------");

		//85점 학생의 예상 등수
		// = 85점보다 높은 점수의 개수 + 1
		int rank = 1;
		int student = 85;
		for(int i=0; i < score.length; i++) {
			if(score[i] > student) {
				System.out.println(score[i]);
				rank++;
			}
		}
		System.out.println("예상 등수 : " + rank);
	}
}