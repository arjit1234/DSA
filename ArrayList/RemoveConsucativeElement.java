package ArrayList;
import java.util.*;
public class RemoveConsucativeElement 
{
	
	public static ArrayList<Integer> removeconsucative(int arr[])
	{
		ArrayList<Integer> result=new ArrayList<Integer>();
		result.add(arr[0]);
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[i-1])
			{
				result.add(arr[i]);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();

		}
		ArrayList<Integer> ans=removeconsucative(arr);
		for(int i=0;i<ans.size();i++)
		{
			System.out.print(ans.get(i)+" ");
		}
	}
}
