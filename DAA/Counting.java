package DAA;

import java.util.Scanner;
public class Counting{
    public static void Sub(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            String a="";
            if(str.charAt(i)=='A'){
                for(int j=i;j<str.length();j++){
                    a=a+str.charAt(j);
                    if(str.charAt(j)=='B'){
                        count=count+1;
                        System.out.println(a);
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
    	System.out.println("Enter the string ");
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        Sub(s);

    }
}