package SearchingSorting;
import java.util.*;
public class MergeSort 
{
	
	
	public static int[] MergeSort(int arr1[],int arr2[])
	{
		int []ans=new int[arr1.length+arr2.length];
		
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				ans[k]=arr1[i];
				k++;
				i++;
			}
			else {
				ans[k]=arr2[j];
				k++;
				j++;
			}
		}
		while(i<arr1.length)
		{
			ans[k]=arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length)
		{
			ans[k]=arr2[j];
			k++;
			j++;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int arr1[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		int n2=sc.nextInt();
		int arr2[]=new int[n2];
		for(int j=0;j<n2;j++)
		{
			arr2[j]=sc.nextInt();
		}
		
		int ans[]=MergeSort(arr1,arr2);
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i]+" ");
		}
	}
}
