package Lesson2;

public class fibonacci {

	public static void main(String[] args){

//		for(int i = 1; i <= 50; i++){
//			System.out.println(i + ":"+fibonacci(i));
//		}
//	}
	System.out.println(fibonacci(50));
	}
	public static long fibonacci(int K){
		
		//base case
		long array[] = new long[K + 1];
		if(K <= 0) return 0;
		array[1] = 1;
			for(int i = 2; i< K+1; i ++){
				array[i] = array[i-1] + array[i-2];
			}
		return array[K];
	}
}
