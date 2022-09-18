package SearchingSorting;
import java.util.*;
public class RotateArray 
{
	public static void rotate(int arr[],int k)
	{
		for(int i=0;i<k;i++)
		{
			swap(arr);
		}
	}
	public static void swap(int arr[])
	{
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
	}
	public static void printarray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
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
		int k=sc.nextInt();
		rotate(arr,k);
		printarray(arr);
	}
}
