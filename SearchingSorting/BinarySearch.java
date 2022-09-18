package SearchingSorting;
import java.util.*;
public class BinarySearch 
{
	
	
	public static int searching(int arr[],int x)
	{
		int s=0;
		int e=arr.length;
		
		int mid=s+(e-s)/2;
		while(s<=e)
		{
			if(arr[mid]==x)
			{
				return mid;
			}
			if(x>arr[mid])
			{
				s=mid+1;
			}
			if(x<arr[mid])
			{
				e=mid-1;
			}
			mid=s+(e-s)/2;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int element=sc.nextInt();
		int ans=searching(arr,element);
		System.out.println(ans);
	}
}
