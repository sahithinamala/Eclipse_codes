package CP;
import java.util.Scanner;

public class BinarySearch{
	public int Binary(int l,int r,int x,int arr[]) {
		if(l<=r) {
			int mid = l + (r - l) / 2;
			if(arr[mid] == x)
				return x;
			if(arr[mid]>x)
				return Binary(l,mid-1,x,arr);
			if(arr[mid]<x)
				return Binary(mid+1,r,x,arr);
		}
		return 0;
	
		}
	public static void main(String[]args) {
		int sum = 25;
		BinarySearch bs = new BinarySearch();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in an array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the elements");
		for(int i = 0;i<n;i++) 
		{
			arr[i] = sc.nextInt();

		}
		int rem = 0;
		int ele = 0;
		System.out.println("The pair is : ");
		for(int i = 0;i<n;i++) {
			ele = arr[i];
			rem = sum - ele;
			int result = bs.Binary(0, n-1, rem, arr);
			if(result!=0)
			System.out.println(result);
		}
	}
}
