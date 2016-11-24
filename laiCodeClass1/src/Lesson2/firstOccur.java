package Lesson2;

public class firstOccur {

	public static void main(String[] args){
		int[] a = {1,3,5,6,7,7,7,7,10,11,14,16};
		System.out.println(firstOccur(a,7));
	}
	//given a target integer T and an integer array A sorted in ascending order,
	//find the index of the first occurence of T in A or return -1
	public static int firstOccur(int[] array, int target){

		if(array == null || array.length == 0) return -1;
		int left = 0;
		int right = array.length - 1;
		
		while(left < right-1){
			int mid = left + (right - left) / 2;
			if(array[mid] == target){
				right = mid;
			}else if(array[mid] < target){
				left = mid;
			}else
				right = mid;
		}
		
		if(array[left] ==  target) return left;
		if(array[right] == target) return right;
		return -1;
	}
}
