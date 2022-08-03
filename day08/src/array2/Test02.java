package array2;

public class Test02 {
	public static void main(String [] args) {
		//준비
		int[] data= new int[] {30,50,20,10,40};
		//계산
		for(int i=0; i<=4; i++) {
			System.out.println(data[i]+", "+data[i+1]);
			if(data[i]>data[i+1]) {
				int backup=data[i];
				
			}
			//if(data[i])
		}
		
		//출력
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
