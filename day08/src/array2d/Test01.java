package array2d;

public class Test01 {
	public static void main(String []args) {
		//차원
		//3개 학교 3개 학년 5개 반 10명씩의 정적 정보 3*3*5
		//0차원(변수)으로 생각하면 변수가 450개 필요하다
//		0차원으로 생각하면  0차원 배열이 45개 필요하다(각 배열은 10칸) 학생
//		1차원으로 생각하면 1차원 배열이 9개 필요하다(각 배열은 1차원 배열 5개로 구성) 반별
//		2차원으로 생각하면 2차원 배열이 3개 필요하다=학교별로(각 배열은 2차원배열 3개로 구성) 학년별
//		3차원으로 생각하면 3차원 배열이 3개 필요하다 학교별
//		4차원으로 생각하면 4차원 전체
		
		//한 반의 정보를 저장할 수 있는 배열
		int[] a= new int[10];
		//한 학년의 정보를 저장할 수 있는 배열
		int[][]b=new int[5][10];
		//한 학교의 정보를 저장할 수 있는 배열
		int[][][]c=new int[3][10][15];
		//전체 정보를 저장할 수 있는 배열
		int [][][][]d= new int[3][3][5][10];
		System.out.println(a.length);
		System.out.println(b.length);
		
	}
}
