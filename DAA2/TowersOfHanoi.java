package DAA2;

public class TowersOfHanoi {
	static void towerOfHanoi(int n, char x, char y, char z) 
    { 
        if (n == 1) 
        { 
            System.out.println("Move disk 1 from rod " + x + " to rod " +y); 
            return; 
        } 
        towerOfHanoi(n-1, x, z, y); 
        System.out.println("Move disk " + n + " from rod " + x+ " to rod " + y); 
        towerOfHanoi(n-1, z, y, x); 
    }
	public static void main(String args[]) 
    { 
        int n = 3; 
        towerOfHanoi(n, 'a','b','c');  
        double p =  Math.pow(2, n);
        double q = p-1;
        System.out.println("Number of reculsive calls " + q);
    } 
} 


