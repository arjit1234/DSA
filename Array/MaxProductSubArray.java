package Array;
import java.util.*;
public class MaxProductSubArray {

	
	public static long product(int arr[])
	{
		long ans=Integer.MIN_VALUE;
		long p=1;
		for(int i=0;i<arr.length;i++)
		{
			p*=arr[i];
			ans=Math.max(ans,p);
			
			if(p==0)
			{
				p=1;
			}
		}
		p=1;
		for(int i=arr.length-1;i>=0;i--)
		{
			p*=arr[i];
			ans=Math.max(ans, p);
			
			if(p==0)
			{
				p=1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		long ans=product(arr);
		System.out.println(ans);
	}
}
