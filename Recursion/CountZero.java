package Recursion;
import java.util.*;
public class CountZero
{
	public static int count(int n)
	{
		if(n<10)
		{
			if(n==0)
			{
				return 1;
			}else {
				return 0;
			}
		}
		
		if(n%10==0)
		{
			return count(n/10)+1;
			
		}else {
			return count(n/10);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=count(n);
		System.out.println(ans);
	}
}
