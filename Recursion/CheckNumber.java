package Recursion;
import java.util.*;
public class CheckNumber 
{
	public static boolean checkNumber(int input[],int x,int startindex)
	{
		if(startindex==input.length)
		{
			return false;
		}
		if(input[startindex]==x)
		{
			return true;
		}
		return checkNumber(input,x,startindex+1);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int x=sc.nextInt();
		boolean ans=checkNumber(arr,x,0);
		System.out.println(ans);
	}
}
