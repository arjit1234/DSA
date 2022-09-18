package SearchingSorting;
import java.util.*;
public class sort012
{
	
	
	public static void sort(int arr[])
	{
		int nextzero=0;
		int nexttwo=arr.length-1;
		int i=0;
		while(i<=nexttwo)
		{
			if(arr[i]==0)
			{
				int temp=arr[nextzero];
				arr[nextzero]=arr[i];
				arr[i]=temp;
				nextzero++;
				i++;
			}
			else if(arr[i]==2)
			{
				int temp=arr[nexttwo];
				arr[nexttwo]=arr[i];
				arr[i]=temp;
				nexttwo--;
			}
			else {
				i++;
			}
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
		
		sort(arr);
		printarray(arr);
	}
}
