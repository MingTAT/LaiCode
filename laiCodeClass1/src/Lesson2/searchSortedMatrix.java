package Lesson2;

import java.util.Arrays;

public class searchSortedMatrix {

	public static void main(String[] args){
		int[][] a = {{1,2,3},{4,5,7},{8,9,10}};
		int target = 1;
		System.out.println(Arrays.toString(search(a,target)));
	}
	//given a 2D matrix that contains integers only, which each row is sorted in an ascending
	//order. The first element of next row is larger than (or equal to)the last element of 
	//previous row.
	//given a target number, returning the position that the target locates within the matrix.
	//if the target number does not exist in the matrix return {-1,-1}
	
	public static int[] search(int[][] matrix, int target){
		
		int[] res = new int[2];
		if(matrix.length == 0){
			return new int[]{-1,-1};
		}
		int row = matrix.length;
		int col = matrix[0].length;
		int left = 0;
		int right = row * col -1;
		while(left <= right){
			int mid = left + (right - left) / 2;
			int r = mid / col;
			int c = mid % col;
			if(matrix[r][c] == target){
				res[0]=r;
				res[1]=c;
				return res;
			}else if(matrix[r][c] <= target){
				left = mid +1 ;
			}else right = mid - 1;
		}
		return new int[]{-1,-1};
	}
}
