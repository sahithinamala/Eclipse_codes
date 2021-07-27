package ab;

import java.util.Scanner;

public class Car_Purchase {
	static Scanner sc = new Scanner(System.in);
	/*void Car(int num_of_tests) {
		int n = num_of_tests;
		n = 1;
		int sum = 0;
		int count = 0;
		int cost[] = new int[10];
		while(n<=3) {
			int x = sc.nextInt(); //number of cars
			int y = sc.nextInt(); //total amount		
		for(int i = 0; i<x-1;i++) {
			cost[i] = sc.nextInt();
			for(int j = 1; j<x;j++) {
				if(cost[i]>cost[j]) {
					int temp = cost[i];
					cost[i] = cost[j];
					cost[j] = temp;		
				}
				if(sum<y) {
					sum = sum + cost[i];
					count++;
				}
				System.out.println("Case #"+n+":"+count);
	
			}
		}
		n++;
		}
	} */
	public static void main(String[]args) {
		//Car_Purchase cp = new Car_Purchase();
		int num_of_tests = sc.nextInt();
		System.out.print(num_of_tests);
	
	//cp.Car(num_of_tests);
	}

}
