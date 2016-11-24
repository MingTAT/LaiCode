package Lesson1;

import java.util.Arrays;

public class MergeSort {
//	  public int[] mergeSort(int[] array) {
//	  
//	  int left = 0;
//	  int right = array.length-1;
//	  int[] solution;
//	  int mid = left + (right - left) / 2;
//	  
//	  if(left == right){
//		  solution = array;
//	  }
//	  
//	
//	    return array;
//	  }
	public static void main(String[] args){
		int[] a = {5,4,3,2,1};
		mergeSort(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void merge(int[] array, int[] aux, int left, int mid, int right){
		for(int k = left; k<= right; k++)
			aux[k] = array[k];
			
		int i = left, j = mid + 1;
		for(int k = left; k <= right; k++){
			if (i > mid) 					array[k] = aux[j++];
			else if (j > right) 				array[k] = aux[i++];
			else if(aux[j]<aux[i])          array[k] = aux[j++];
			else 							array[k] = aux[i++];
		}
		
	}
	
	public static void sort(int[] array, int[] aux, int left, int right){
		if(right <= left) return;
			
		int mid = left + (right - left) / 2;
		sort(array, aux, left, mid);
		sort(array, aux, mid+1, right);
		merge(array, aux, left, mid, right);
	}
	
	public static int[] mergeSort(int[] array){
		int[] aux = new int[array.length];
		sort(array, aux, 0, array.length -1);
		return array;

	}
	

	}


