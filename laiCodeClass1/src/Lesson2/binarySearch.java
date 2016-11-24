package Lesson2;

public class binarySearch {
	
	
	public static void main(String[] args){
		int[] a = {1,2,3,4,4,5,6,9,10,22,21};
		System.out.print(binarySearch(a,4));
	}
	//Given a target integer T and an integer array A sorted in ascending order, 
	// find the index i such that A[i]==T or return -1 if there is no such index.
	//Assumptions: duplicate elements in the array, and you can return any of indices i
	public static int binarySearch(int[] array, int target){
		int left = 0;
		int right = array.length - 1;
		if(array == null || array.length == 0 ) return -1;
		while(left <= right){
				int mid = left + (right - left) / 2;
				if(array[mid] == target) return mid;
				else if(array[mid] < target){
					left = mid + 1;
				}else
					right = mid -1;
		}
		return -1;
	}
}
