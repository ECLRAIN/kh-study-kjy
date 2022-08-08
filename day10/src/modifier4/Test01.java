package modifier4;

public class Test01 {
	public static void main(String []args) {
		
		Police podol= new Police("포돌이", "순경", "영등포경찰서");
		Police posoun= new Police("포순이", "경장", "당산파출소");
		Police pogri= new Police("포그리", "순경","마포경찰서");
		
		//포돌2번 쏴
		podol.Shoot();
		podol.Shoot();
		//포순1번
		posoun.Shoot();
		//포그리3번
		pogri.Shoot();
		pogri.Shoot();
		pogri.Shoot();
		
		//출력
		
		podol.print();
		posoun.print();
		pogri.print();
	}
}