package Recursion;
import java.util.*;
public class LastIndex
{
	public static int LastIndex(int input[],int x,int startIndex)
	{
		if(startIndex==input.length)
		{
			return -1;
		}
		int smallans=LastIndex(input,x,startIndex+1);
		if(smallans!=-1)
		{
			return smallans;
		}
		else if(input[startIndex]==x)
		{
			return startIndex;
		}else {
			return -1;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		int ans=LastIndex(arr,x,0);
		System.out.println(ans);
	}
}
