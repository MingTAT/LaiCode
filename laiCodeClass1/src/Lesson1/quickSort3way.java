package Lesson1;

import java.util.Arrays;

public class quickSort3way {
	
	public static void main(String[] args){
		int[] a = {1,5,9,2,6,1,0,3};
		QuickSort(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static int[] QuickSort(int[] array){
		sort(array, 0, array.length-1);
		return array;
	}
	
	public static void sort(int[] array, int left, int right){
		if(right <= left) return;
		int lt = left, gt = right;
		int value = array[left];
		int i = left;
		while (i <= gt){
			if 		(array[i] < value) exch(array, lt++, i++);
			else if (array[i] > value) exch(array, i, gt--);
			else			i++;
		}
		
		sort(array, left, lt-1);
		sort(array, gt+1, right);
		
	}
	
	public static void exch(int[] array, int i, int j){
		int swap = array[i];
		array[i] = array[j];
		array[j] = swap;
	}
}
