package demossmm;
import java.util.*;
public class myclass {
	public static boolean square(int n) {
		
		int r,sum=0;		
		while(n>0) {
			r=n%10;
			sum=(int) (sum+Math.pow(r,2));
			n=n/10;	
		}
		if(sum==1) 
			return true;
		else  if(sum>=10)
			return square(sum);	 
		else
			return false;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(square(n));
	}
	

}
