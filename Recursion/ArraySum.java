package Recursion;
import java.util.*;
public class ArraySum
{
	public static int arraysum(int arr[],int startindex)
	{
		if(startindex==arr.length)
		{
			return 0;
		}
		
		return arr[startindex]+arraysum(arr,startindex+1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int ans=arraysum(arr,0);
		System.out.println(ans);
	}
}
