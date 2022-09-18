package Array;

import java.util.Scanner;

public class Unique 
{
	
	public static int unique(int arr[])
	{
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]!=arr[j])
				{
					break;
				}
			}
			return arr[i];
		}
		return Integer.MAX_VALUE;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		int ans=unique(arr);
		System.out.println(ans);
	}
}
