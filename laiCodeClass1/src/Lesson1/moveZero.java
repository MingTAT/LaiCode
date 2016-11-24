package Lesson1;

import java.util.Arrays;

public class moveZero {

	public static void main(String[] args){
		int[] a = {1,2,0,9,5,3,0,7,0,8,0};
		moveZero(a);
		System.out.println(Arrays.toString(a));
	}
	// given an array of integers, move all the 0s to the right end of the erray
	public static int[] moveZero(int[] array){
	
		int count = 0;
		int[] temp = new int[array.length];
		for(int i=0; i<array.length; i++){
			if(array[i] != 0){
				temp[count++] = array[i];
			}
		}
		while(count < array.length){
			temp[count++] = 0;
		}
		for(int i=0; i<array.length; i++)
			array[i] = temp[i];
		
		return array;
	}
	
	public static void exch(int[] array, int i, int j){
		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
	}
	
}
