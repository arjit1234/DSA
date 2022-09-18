package Array;
import java.util.*;
public class ArrayInterSection
{
	
	public static void intersection(int arr1[],int arr2[])
	{
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int n=arr1.length;
		int m=arr2.length;
		
		int i=0,j=0;
		while(i<n && j<m)
		{
			if(arr1[i]==arr2[j])
			{
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}
			else if(arr1[i]<arr2[j])
			{
				i++;
			}
			else {
				j++;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr1[]=new int[n];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		int m=sc.nextInt();
		int arr2[]=new int[m];
		for(int j=0;j<arr2.length;j++)
		{
			arr2[j]=sc.nextInt();
		}
		
		intersection(arr1,arr2);
		
		
	}
}
