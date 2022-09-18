package Recursion1;
import java.util.*;
public class QuickSort 
{
	
	private static int partition(int input[],int startIndex,int endIndex)
	{
		int pivot=input[startIndex];
		int count=0;
		for(int i=startIndex+1;i<=endIndex;i++)
		{
			if(input[i]<=pivot)
			{
				count++;
			}
			
		}
		
		int pivotIndex=startIndex+count;
		input[startIndex]=input[pivotIndex];
		input[pivotIndex]=pivot;
		
		
		int i=startIndex,j=endIndex;
		while(i<j)
		{
			while(i<=endIndex && input[i]<pivot)
			{
				i++;
			}
			while(input[j]>pivot)
			{
				j--;
			}
			if(i<=j)
			{
				int temp=input[i];
				input[i]=input[j];
				input[j]=temp;
				i++;
				j--;
			}
		}
		
		return pivotIndex;
	}
	public static void quicksort(int input[],int startIndex,int endIndex)
	{
		if(startIndex>=endIndex)
		{
			return;
		}
		
		int PartitionInex=partition(input,startIndex,endIndex);
		quicksort(input,startIndex,PartitionInex-1);
		quicksort(input,PartitionInex+1,endIndex);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		quicksort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
