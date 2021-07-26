package practice;

import java.util.Scanner;


public class Decimal2binary
{
    static void dectobin(int n){
        int bin[] = new int[1000000000];
        int i = 0;
        while(n > 0){
          bin[i++] = n%2;
          n = n/2;
        }
        for(int j = i-1;j >= 0;j--){
          System.out.print(bin[j]);
        }
    
        
    }
    static void bintodec(int binary) {
    	int base = 1;
    	
    	int dec = 0;
    	while(binary > 0) {
    		int lastdigit = binary%10;
    		dec = dec+ lastdigit*base;
    		binary = binary/10;
    		base = base*2;
        	 
         }
    	System.out.println(dec);
    }
    static void bintohex(int binary,int hexadecimal[]) {
    	int rem;
    	int i = 1;
    	int j;
    	int dec = 0;
    	while(binary>0) {
    		rem = binary%10;
    		dec = dec + rem*i;
    		binary = binary / 10;
    		i = i*2;
    	}
    	i = 0;
    	while(dec!=0) {
    		hexadecimal[i] = dec%16;
    		dec = dec/16;
    		i++;
    	}
    	System.out.println("HexaDecimal Value is:");
    	for(int j1 = i - 1; j1>=0;j1--) {
    		if(hexadecimal[j1]>9) {
    			System.out.print((char)(hexadecimal[j1] + 55));
    		}
    		else {
    			System.out.print(hexadecimal[j1]);
    		}
    	}
    }
    static void hextobin(String hexadec) {
    	int i1 =0;
    	int len = hexadec.length();
    	for( i1 =0;i1<len;i1++) {
    		switch(hexadec.charAt(i1)) {
    		case '0':
    			System.out.print("0000");
    			break;
    		case '1':
    			System.out.print("0001");
    			break;
    		case '2':
    			System.out.print("0010");
    			break;
    		case '3':
    			System.out.print("0011");
    			break;
    		case '4':
    			System.out.print("0100");
    			break;
    		case '5':
    			System.out.print("0101");
    			break;
    		case '6':
    			System.out.print("0110");
    			break;
    		case '7':
    			System.out.print("0111");
    			break;
    		case '8':
    			System.out.print("1000");
    			break;
    		case '9':
    			System.out.print("1001");
    			break;
    		case 'A':
    		case 'a':
    			System.out.print("1010");
    			break;
    		case 'B':
    		case 'b':
    			System.out.print("1011");
    			break;
    		case 'C':
    		case 'c':
    			System.out.print("1100");
    			break;
    		case 'D':
    		case 'd':
    			System.out.print("1101");
    			break;
    		case 'E':
    		case 'e':
    			System.out.print("1110");
    			break;
    		case 'F':
    		case 'f':
    			System.out.print("1111");
    			break;
    		default: 
    			System.out.println("Invalid" + hexadec.charAt(i1));
    			
    			return;
    		}
    	}
    }
    public static void main(String[]args)
    {
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number to be converted: ");
        int n = sc.nextInt();
        dectobin(n);
        System.out.println("Enter the binary number to be converted: ");
        int binary = sc.nextInt(); 
        bintodec(binary);
        int[] hexadecimal = new int[100000000];
        bintohex(binary, hexadecimal);
        System.out.println("Enter the hexadecimal number to be converted: ");
        String hexadec = sc.nextLine();
        hextobin(hexadec);
        
    }
    
}