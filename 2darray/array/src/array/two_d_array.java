package array;
import java.util.*;

public class two_d_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows and column: ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int arr [][]= new int [n1][n2];
		int sum1=0;
		System.out.print("Enter input: ");
		for(int i = 0;i<n1;i++) {
			for(int j = 0;j<n2;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i = 0;i<n1;i++) {
			for(int j = 0;j<n2;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i = 0;i<n1;i++) {
			for(int j = i;j<n2;j++) {
				sum1+=arr[i][j];
			}			
		}
		System.out.println("Sum of lower triangular matrix: "+sum1);
		sum1=0;
		for(int i = 0;i<n1;i++) {
			for(int j = 0;j<=i;j++) {
				sum1+=arr[i][j];
			}			
		}
		System.out.println("Sum of upper triangular matrix: "+sum1);
		sum1=0;
		System.out.println("Without including diagonal lower matrix");
		for(int i = 0;i<n1;i++) {
			for(int j = 0;j<i;j++) {
				sum1+=arr[i][j];
			}			
		}
		System.out.println("Sum of lower triangular matrix: "+sum1);
	}

}
