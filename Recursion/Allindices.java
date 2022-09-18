package Recursion;
import java.util.*;
public class Allindices
{
	
	public static int[] allIndices(int input[],int x,int startIndex)
	{
		if(input[startIndex]==input.length)
		{
			int output[]=new int[0];
			return output;
		}
		
		int smalloutput[]=allIndices(input,x,startIndex+1);
		if(input[startIndex]==x)
		{
			int output[]=new int[smalloutput.length+1];
			output[0]=startIndex;
			for(int i=0;i<smalloutput.length;i++)
			{
				output[i+1]=smalloutput[i];
			}
			return output;
		}else {
			return smalloutput;
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
		int x=sc.nextInt();
		int ans[]=allIndices(arr,x,0);
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i]+" ");
		}
	}
}
