package Array;
import java.util.*;

public class MaximumMinimum
{
	
	public static void maximummin(int arr[])
	{
		int n=arr.length;
		int min=arr[0],max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("The min element is "+min);
		System.out.println("Tha max element is "+max);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		maximummin(arr);
	}
}
