package Array;
import java.util.*;
public class FindDuplicate 
{
	
	public static int duplicate(int arr[])
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<(arr.length-1);i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					al.add(arr[i]);
				}
			}
		}
		int[] ans=new int[al.size()];

	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int ans=duplicate(arr);
		System.out.println(ans);
	}
}
