package Reverse;

import java.util.*;
public class Reverse_String {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = sc.nextLine();
		char[] word1 = word.toCharArray();
		for(int i = word1.length-1;i>=0;i--) {
			System.out.print(word1[i]);
		}
		sc.close();
	}

}