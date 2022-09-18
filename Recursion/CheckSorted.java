package Recursion;
import java.util.*;
public class CheckSorted 
{
	
	public static boolean checksorted(int input[])
	{
		if(input.length<=1)
		{
			return true;
		}
		
		int smallinput[]=new int[input.length-1];
		for(int i=1;i<input.length;i++)
		{
			smallinput[i-1]=input[i];
		}
		
		boolean smallans=checksorted(smallinput);
		if(!smallans)
		{
			return false;
		}
		if(input[0]<=input[1])
		{
			return true;
		}else {
			return false;
		}
			
	}
	public static boolean checksorted1(int input[])
	{
		if(input.length<=1)
		{
			return true;
		}
		if(input[0]>input[1])
		{
			return false;
		}
		int smallinput[]=new int[input.length-1];
		for(int i=1;i<input.length;i++)
		{
			smallinput[i-1]=input[i];
		}
		boolean smallans=checksorted1(smallinput);
		return smallans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(checksorted1(arr));
	}
}
