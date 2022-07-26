package data;
import java.lang.*;
public class Test14 {
	public static void main(String[] args) {
		//키180cm 즉 1.8m, 체중80kg
		//bmi공식= 체중/키*2
		int height = 180;
		int weight = 80;
	    float heightM = (float)height / 100;
	    float bmi = (float)weight / (heightM*heightM);
	    System.out.println("BMI 수치는");
	    System.out.println(bmi);
			   
	}
}
