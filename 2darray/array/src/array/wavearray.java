package array;

import java.util.Arrays;

public class wavearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8, 1, 2, 3, 4, 5, 6, 4, 2};
		int temp=0;
		for(int i=1;i<arr.length;i+=2) {
			if(arr[i-1]>arr[i]) {
				temp=arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=temp;
			}
			if((i+1)<arr.length && arr[i]<arr[i+1]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
