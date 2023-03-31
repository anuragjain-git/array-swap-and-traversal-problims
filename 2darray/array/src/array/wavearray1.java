package array;

import java.util.Arrays;

public class wavearray1 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,3,2,1,2,365,8,6};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int temp=0;
		for(int i=0;i<arr.length;i+=2) {
			if((i+1)<arr.length) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
