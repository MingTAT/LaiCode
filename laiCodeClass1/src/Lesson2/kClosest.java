package Lesson2;

public class kClosest {

	//given a target integer T, a non-negative integer K and an integer 
	//array A sorted in ascending order, find the K closest numbers to T in A
	public static int[] kClosest(int[] array, int target, int k){

		int left = 0;
		int right = array.length - 1;
		
		int res[] = new int[k];
		for(int i = 0; i < k; i++){
			if(left <0 ){
				res[i] = array[right++];
			}else if(right >= array.length){
				res[i] = array[left--];
			}else if(Math.abs(array[left] -target) < Math.abs(array[right] - target)){
				res[i] = array[left --];
			}else res[i] = array[right++];
		}
	}
	
	public static int cloest(int[] array, int target){
		int left = 0;
		int right = array.length - 1;
		while(left < right -1){
			int mid = left + (right - left) / 2;
			if(array[mid] == target) {
				return mid;
			}
			else if(array[mid] < target){
				left = mid;
			}else if(array[mid] > target){
				right = mid;
			}
		}
	}
	
}
