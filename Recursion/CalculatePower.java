package Recursion;
import java.util.*;
public class CalculatePower 
{
	
	public static int power(int x,int n)
	{
		if(x==0 && n==0)
		{
			return 1;
		}
		if(n==0)
		{
			return 0;
		}
		if(n==0)
		{
			return 1;
		}
		int smallAns=power(x,n/2);
		if(n%2==0)
		{
			return smallAns * smallAns;
		}else {
			return x * smallAns * smallAns;
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		
		power(x,n);
	}
}
