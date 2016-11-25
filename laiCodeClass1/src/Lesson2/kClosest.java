package Lesson2;

import java.util.Arrays;

public class kClosest {

	
	public static void main(String[] args){
		int[] a = {4,7,12,33,100,200};
		int[] res = kClosest(a,50,3);
		System.out.println(Arrays.toString(res));
	}
	//given a target integer T, a non-negative integer K and an integer 
	//array A sorted in ascending order, find the K closest numbers to T in A
	public static int[] kClosest(int[] array, int target, int k){

		int left = 0, index = 0;
		int right = array.length - 1;
		int res[] = new int[k];
		while(left < right -1){
			int mid = left + (right - left) / 2;
			if(array[mid] == target) {
				index = mid;
			}
			else if(array[mid] < target){
				left = mid;
			}else if(array[mid] > target){
				right = mid;
			}
		}
		
		
		for(int i = 0; i < k; i++){
			if(left < 0){
				res[i] = array[right++];
			}else if(right >= array.length){
				res[i] = array[left--];
			}else if(Math.abs(array[left] -target) < Math.abs(array[right] - target)){
				res[i] = array[left --];
			}else res[i] = array[right++];
		}
		return res;
	}
	

	
}
