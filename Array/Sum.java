package Array;
import java.util.*;
public class Sum
{
	
	public static int sum(int arr[])
	{
		int ans=0;
		for(int i=0;i<arr.length;i++)
		{
			ans+=arr[i];
		}
		return ans;
	}
	public static int[] takeinput()
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
		
		int arr[]=takeinput();
		int ans=sum(arr);
		System.out.println(ans);
	}
}
