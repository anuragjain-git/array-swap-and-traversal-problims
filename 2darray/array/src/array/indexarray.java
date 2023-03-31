package array;

import java.util.Arrays;

public class indexarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8, 0, 6, 1, 9, 3, 2, 7, 4,5};
		int temp=0;
		int newtemp=0;
		for(int i=0;i<arr.length;i++) {
			while (arr[i] != -1 && arr[i] != i){	
			temp = arr[i];
			arr[i] = arr[temp];
			arr[temp] = temp;
		
		}
		
	}
		System.out.println(Arrays.toString(arr));
}}
