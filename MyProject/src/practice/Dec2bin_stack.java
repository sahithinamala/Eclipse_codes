package practice;
import java.util.*;
public class Dec2bin_stack {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		System.out.println(" Enter the decimal number");
		int n = sc.nextInt();
		
		while(n!=0) {
			int num = n%2;
			st.push(num);
			n = n/2;
			
		}
		System.out.println("Binary representation is:" );
		while (!(st.isEmpty() ))
	    {
	      System.out.print(st.pop());
	    }
		System.out.println();
	}
}


