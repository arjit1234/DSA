package Array;
import java.util.*;
public class UniqueElement
{
	public static int unique(int arr[])
	{
		int XOR=0;
		for(int i=0;i<arr.length;i++)
		{
			XOR^=arr[i];
		}
		return XOR;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int ans=unique(arr);
		System.out.println(ans);
	}
}
