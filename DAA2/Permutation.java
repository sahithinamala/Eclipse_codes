package DAA2;
import java.util.*;

	public class Permutation{
	    public static void Perm(int a[],int k,int n){
	        if(k==n){
	            for(int i=0;i<a.length;i++){
	                System.out.print(a[i]);
	            }
	            System.out.println();
	        }
	        else{
	            for(int i=k;i<=n;i++){
	                swap(a,i,k);
	                Perm(a,k+1,n);
	                swap(a,i,k);
	            }
	        }

	    }
	    public static int[] swap(int c[],int b,int a){
	        int temp=c[a];
	        c[a]=c[b];
	        c[b]=temp;
	        return c;
	    }
	    public static void main(String[] args) {
	       Scanner ob=new Scanner(System.in);
	       int n=ob.nextInt();
	       int f[]=new int[n];
	       for(int i=0;i<n;i++){
	           f[i]=ob.nextInt();
	       }
	       Perm(f,0,n-1);
	    }
	}


