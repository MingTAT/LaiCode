package Lesson1;

import java.util.Arrays;

public class RainbowSort {
	
	public static void main(String[] args){
		int[] a = {1,1,1,1,0,0,1,-1,0,-1,1,-1};
		rainbowSort(a);
		//exch(a, 8,9);
		System.out.println(Arrays.toString(a));
	}
	public static int[] rainbowSort(int[] array){
		
		int i = 0, j=0;
		int k = array.length-1;
		while(j <= k){
			if(array[j] == 0){
				j++;
			}else if(array[j] == -1){
				exch(array, i, j);
				i++;
				j++;
			}else if(array[j] == 1){
				exch(array, j, k);
				k--;
			}
		}
		
		return array;
		
	}
	
	public static void exch(int[] array, int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
