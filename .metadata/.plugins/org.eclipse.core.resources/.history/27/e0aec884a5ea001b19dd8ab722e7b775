package ab;
import java.util.*;
public class Sparse_arrays {
	static void compare(String arr1[],String arr2[], int n,int m) {
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				if(arr1[i] == arr2[j]) {
					System.out.println(arr2[j] + " in arr1");
				}
				else {
					System.out.println(arr2[j] + " not present in arr1");
				}
			}
		}
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of arr1");
		int n = sc.nextInt();
		System.out.println("Enter size of arr2");
		int m = sc.nextInt();
		String arr1[] = new String[n];
		String arr2[] = new String[m];
		System.out.println("Enter elements of arr1");
		for(int i = 0;i <n;i++) {
			
			arr1[i]= sc.nextLine();
			
		}
		System.out.println("Enter elements of arr2");
		for(int i = 0;i<n;i++) {
			
			arr2[i] = sc.nextLine();
		}
		compare(arr1,arr2,n,m);
	}

}
