package Array;
import java.util.*;
public class RemoveDuplicate 
{
	public static void removeduplicate(int arr[])
	{
		ArrayList<Integer> arr1=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]!=arr[j])
				{
					arr1.add(arr[i]);
				}
			}
		}
		System.out.println(arr1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		removeduplicate(arr);
	}
}
