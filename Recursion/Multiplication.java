package Recursion;
import java.util.*;
public class Multiplication 
{
	public static int multiplyTwo(int n,int m)
	{
		if(m==0 || n==0)
			return 0;
		return m+multiplyTwo(m,n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int ans=multiplyTwo(m,n);
		System.out.println(ans);
	}
}
