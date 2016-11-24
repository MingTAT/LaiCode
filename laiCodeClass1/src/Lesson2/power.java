package Lesson2;

public class power {
	
	
	public static void main(String[] args){

		System.out.println(power(2,1));
		System.out.println(power(0,1));
		System.out.println(power(5,2));
		
	}
	//power(2,1) = 1
	public static long power(int a, int b){

		if(b == 0) return 1;
		if(b == 1) return a;
		if(b % 2 == 0){

			return power(a * a, b / 2);
		}else
			return a * power(a * a, b / 2);
		
	}
}
