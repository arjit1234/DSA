package Array;
import java.util.*;

public class LinearSearch 
{
	
	
	public static int largest(int arr[],int n)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				return i;
			}
		}
		return -1;
	}
	public static int[] takinput()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void main(String[] args) {
	
		int arr[]=takinput();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=largest(arr,n);
		System.out.println(ans);
	}
}
