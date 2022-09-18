package Array;
import java.util.*;
public class Takeinput
{
	
	public static void printarray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static int[] takeinput()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void main(String[] args) {
		
		
		int arr[]=takeinput();
		printarray(arr);
	}
}
