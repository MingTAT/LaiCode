package Lesson1;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args){
		int[] a = {3,2,1,5,4,2,1};
		QuickSort(a);
		//partition(a,0,2);
		System.out.println(Arrays.toString(a));
		//System.out.println(Arrays.toString(a));
	}
	public static int[] QuickSort(int[] array){
		sort(array, 0, array.length-1);
		return array;
	}
	
	public static int partition(int[] array, int left, int right){
		int i = left, j = right + 1;
		while(true){
			while(array[++i] < array[left])				//find item on left to swap
				if(i == right) break;
			while(array[right] < array[--j])			//find item on right to swap
				if(j == left) break;
			if(i >= j)break;							//check if pointers cross
			exch(array, i, j);
		}
		exch(array, left, j);
		return j;
		
	}
	
	public static void sort(int[] array, int left, int right){
		if(right <= left) return;
		int j = partition(array, left, right);
		sort(array, left, j-1);
		sort(array, j+1, right);
	}
	
	public static void exch(int[] array, int i, int j){
		int swap = array[i];
		array[i] = array[j];
		array[j] = swap;
	}
}
