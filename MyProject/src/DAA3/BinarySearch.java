 package DAA3;


 import java.lang.reflect.Array;
 class BinarySearch { 

 int binarySearch(int arr[], int i, int l, int x) 
     { 
 if (l>= i) { 
 int mid = i + (l - i) / 2; 


 if (arr[mid] == x) 
 return mid; 


 if (arr[mid] >x) 
 return binarySearch(arr, i, mid - 1, x); 


 return binarySearch(arr, mid + 1, l, x); 
         } 


 return -1; 
     }

 public static void main(String args[]) 
     { 
 	BinarySearch ob = new BinarySearch(); 
 int arr[] = {-15,-6,0,7,9,23,54,82,101,112,125,131 }; 
 int n = arr.length;

 for(int i=0;i<n;i++)
         {
 	int x=(int)Array.get(arr,i);
 	
 int result = ob.binarySearch(arr, 0, n - 1, x); 
 if (result == -1) 
 System.out.println("Element not present"); 
 else
 System.out.println("Element found at index " + result); 
         }
     }
