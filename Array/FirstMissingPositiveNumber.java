package Array;
import java.util.*;
public class FirstMissingPositiveNumber {

	static int find(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			while(arr[i]>=1 && arr[i]<n && arr[i]!=arr[arr[i]-1])
			{
				swap(arr[i],arr[arr[i]-1]);
			}
			
		}
		for(int i=0;i<n;i++)
		{
			if(i+1!=arr[i]) return i+1;
		}
		return n+1;
	}
	static void swap(int s,int e)
	{
		int temp=s;
		s=e;
		e=temp;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int ans=find(arr);
		
	}
}
