package SearchingSorting;
import java.util.*;
public class SumTwoArray 
{
	
		public static void sum(int arr1[],int arr2[],int output[])
		{
			int i=arr1.length-1;
			int j=arr2.length-1;
			int k=Math.max(arr1.length, arr2.length);
			int carry=0;
			while(i>=0 && j>=0)
			{
				int sum=arr1[i]+arr2[j]+carry;
				output[k]=sum%10;
				carry=sum/10;
				i--;
				j--;
				k--;
				
			}
			while(i>=0)
			{
				int sum=arr1[i]+carry;
				output[k]=sum%10;
				carry=sum/10;
				i--;
				k--;
			}
			while(j>=0)
			{
				int sum=arr1[j]+carry;
				output[k]=sum%10;
				carry=sum/10;
				j--;
				k--;
			}
			output[0]=carry;
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
			
			int n3=Math.max(n1, n2);
			int output[]=new int[n3];
			sum(arr1,arr2,output);
			
		}
}
