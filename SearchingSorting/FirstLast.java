package SearchingSorting;
import java.util.*;
public class FirstLast 
{
	
	public static int firstoccurance(int arr[],int n)
	{
		int s=0,e=arr.length-1;
		int mid=s+(e-s)/2;
		int ans=-1;
		while(s<=e)
		{
			if(arr[mid]==n)
			{
				ans=mid;
				e=mid-1;
			}
			if(n>arr[mid])
			{
				s=mid+1;
			}
			if(n<arr[mid])
			{
				e=mid-1;
			}
			mid=s+(e-s)/2;
		}
		return ans;
	}
	public static int lastoccurance(int arr[],int n)
	{
		int s=0,e=arr.length-1;
		int mid=s+(e-s)/2;
		int ans=-1;
		while(s<=e)
		{
			if(arr[mid]==n)
			{
				ans=mid;
				s=mid+1;
			}
			if(n>arr[mid])
			{
				s=mid+1;
			}
			if(n<arr[mid])
			{
				e=mid-1;
			}
			mid=s+(e-s)/2;
		}
		return ans;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int x=sc.nextInt();
		System.out.println("First Occurance is:"+firstoccurance(arr,x));
		System.out.println("Last Occurance is:"+lastoccurance(arr,x));
		
	}
}
