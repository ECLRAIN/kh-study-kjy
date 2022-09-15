package oop.keyword4;

public class Robot {

	public static int squared(int value) {
		return value * value;
	}
	
	public static double bmi(double cm, double kg) {
		double m = cm / 100;
		return kg / (m * m);
	}
	
	public static int subway(int year) {
		int age = 2022 - year + 1;
		if(age < 8 || age >= 65) {
			return 0;
		}
		else if(age < 14){
			return 450;
		}
		else if(age < 20) {
			return 720;
		}
		else {
			return 1250;
		}
	}
	
	public static double triangle(int width, int height) {
		return width * height / 2.0;
	}
	
	public static double circle(int radius) {
		return 3.14 * radius * radius;
	}
	
}







