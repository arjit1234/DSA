package Recursion;
import java.util.*;
public class FindGeomatricSum
{
	
	public static double findsum(int n)
	{
		if(n==0)
		{
			return 1;
		}
		
		return findsum(n-1)+1/Math.pow(2, n);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double ans=findsum(n);
		System.out.println(ans);
	}
}
