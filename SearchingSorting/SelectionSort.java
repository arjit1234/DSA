package SearchingSorting;
import java.util.*;
public class SelectionSort
{
	
	
	public static void selectionsort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int min=Integer.MAX_VALUE;
			int minindex=-1;
			for(int j=i;j<n;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					minindex=j;
				}
			}
			int temp=arr[minindex];
			arr[minindex]=arr[i];
			arr[i]=temp;
		}
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
		
		selectionsort(arr);
		printarray(arr);
	}
}
