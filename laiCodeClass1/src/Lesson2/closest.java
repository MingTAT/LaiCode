package Lesson2;

public class closest {

	public static void main(String[] args){
		int[] a = {1,2,3,5,6};
		System.out.println(closest(a,7));
	}
	//given a target integer T and an integer array A sorted in ascending order,
	//find index i in A such that A[i] is closest to T
	
	public static int closest(int[] array, int target){
		//base case, check if array is null
		if(array == null || array.length == 0) return -1;
		int left = 0;
		int right = array.length - 1;
		while(left < right -1){
			int mid = left + (right - left) / 2;
			if(array[mid] == target) return mid;
			else if(array[mid] < target){
				left = mid;
			}else if(array[mid] > target){
				right = mid;
			}
		}
		if((target - array[left]) <= (array[right] - target)){
			return left;
		}else return right;
	}
}
