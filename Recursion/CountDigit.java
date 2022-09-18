package Recursion;
import java.util.*;
public class CountDigit 
{
	public static int count(int n)
	{
		if(n==0)
		{
			return 0;
		}
		
		int ans=count(n/10);
		return ans+1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=count(n);
		System.out.println(ans);
	}
}
