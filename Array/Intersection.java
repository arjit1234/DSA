package Array;
import java.util.*;

public class Intersection
{
	
	
	public static void intersection(int arr1[],int arr2[])
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]+" ");
					arr2[j]=Integer.MIN_VALUE;
					break;
				}

			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		for(int j=0;j<n2;j++)
		{
			arr2[j]=sc.nextInt();
		}
		
		intersection(arr1,arr2);
	}
}
