package CP;

import java.util.Scanner;

public class Sum25 {
	public static void main(String[]args) {
		int k = 25;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in an array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements");
		for(int i = 0;i<n;i++) 
		{
			arr[i] = sc.nextInt();
		}
		int mid = n/2;
		System.out.println("The pair is: ");
		for(int i = 0;i<n;i++) 
		{
			int element = arr[i];
			int rem = k - element;
			
		if(rem>arr[mid])
		{			
			for(int j = n-1;j>mid;j--) 
			{
					if(arr[j] == rem) 
					{
						System.out.println(rem);
					}
			}
		}	
			else {
				for(int j = 0;j<=mid;j++) 
				{
					if(arr[j] == rem)
					{
						System.out.println(rem);
					}
				}
			}
		}
	}
}
	
		


