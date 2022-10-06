package Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class IsTripletSum {

	public static boolean isTriplet(int []arr,int m)
	{
		int n=arr.length;
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			if(isPair(arr,i+1,n-1,(m-arr[i])))
				return true;
		}
		return false;
	}
	public static boolean isPair(int arr[],int s,int e,int x)
	{
		while(s<e)
		{
			if(arr[s]+arr[e]==x)
			{
				return true;
			}
			if(arr[s]+arr[e]>x)
			{
				e--;
			}else {
				s++;
			}
		}
		return false;
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
		if(isTriplet(arr,x))
		{
			System.out.println("Triplet");
		}else {
			System.out.println("Not Triplet");
		}
	}
}
