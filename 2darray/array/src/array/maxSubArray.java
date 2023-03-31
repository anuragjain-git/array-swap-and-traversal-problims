package array;

public class maxSubArray {
	
	public static int maxSum(int[] arr, int size) {
		int subarr[] = new int[size];
		int max = 0;
		int newmax = 0;
		int temp=0;
		int temp1=0;
		for(int i=0;i<size;i++) {
			newmax+=arr[i];
			if(newmax<0) {
				newmax = 0;
				temp=i;
			}
			if(max<newmax) {
				temp1=temp;
				max = newmax;
				
			}
		}
//		System.out.println(temp);
//		System.out.println(temp1);	
		
//		print subarray
		for(int k=temp1+1;k<temp;k++) {
			System.out.print(arr[k]+" ");
		}
		System.out.println();
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,-2,3,4,-4,6,-10,3,2,5,7,-18,5};

		int size = arr.length;
		System.out.println("Sum is : "+maxSum(arr,size));;
	}

}
