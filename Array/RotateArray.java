package Array;
import java.util.*;
public class RotateArray {
	
	public static void rotate(int arr[],int n,int k) {
		if(k>n)
		{
			k=k-n;
		}
		
		int arr1[]=new int[k];
		for(int i=0;i<k;i++)
		{
			arr1[k]=arr[i];
		}
		for(int i=0;i<n-k;i++)
		{
			arr[i]=arr[i+k];
		}
		int count=0;
		for(int i=n-2;i<n;i++)
		{
			arr[i]=arr1[count++];
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
		rotate(arr,n,k);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
