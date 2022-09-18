package Array2D;
import java.util.*;
public class LargestColumnSum
{
	
	public static int[][]  takeinput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Rows:");
		int row=sc.nextInt();
		System.out.println("Enter the Number of Cols:");
		int cols=sc.nextInt();
		int arr[][]=new int[row][cols];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.println("Enter the Element at "+i+" th "+j+" th column");
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	public static void print(int input[][] )
	{
		int row=input.length;
		int col=input[0].length;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(input[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int largestsum(int arr[][])
	{
		int largest=Integer.MAX_VALUE;
		int row=arr.length;
		int col=arr[0].length;
		for(int j=0;j<col;j++)
		{
			int sum=0;
			for(int i=0;i<row;i++)
			{
				sum+=arr[i][j];
			}
			if(sum>largest)
			{
				largest=sum;
			}
			
			
		}
		return largest;
	}
	public static void main(String[] args) {
		
		int input[][]=takeinput();
//		print(input);
		int ans=largestsum(input);
		System.out.println(ans);
	}
}
