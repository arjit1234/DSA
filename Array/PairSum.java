package Array;
import java.util.*;

public class PairSum
{
	
	public static int pair(int arr[],int x)
	{
		int pairsum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==x)
				{
					pairsum+=1;
				}
			}
		}
		return pairsum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int ans=pair(arr,7);
		System.out.println(ans+" ");
	}
}
