package SearchingSorting;
import java.util.*;
public class SecondLargest 
{
	
	
	public static int secondlargest(int arr[])
	{
//		if(arr.length==0)
//		{
//			return Integer.MAX_VALUE;
//		}
		
		int largest=-1,secondlargest=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(largest<arr[i])
			{
				secondlargest=largest;
				largest=arr[i];
			}
			else if(secondlargest<arr[i] && largest!=arr[i])
			{
				secondlargest=arr[i];
			}
		}
		return secondlargest;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int ans=secondlargest(arr);
		System.out.println(ans);
	}
}
