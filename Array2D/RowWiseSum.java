package Array2D;
import java.util.*;
public class RowWiseSum
{
	
	public static void rowsum(int arr[][])
	{
		int nrow=arr.length;
		if(nrow==0)
		{
			return;
		}
		
		int ncols=arr[0].length;
		
		for(int i=0;i<nrow;i++)
		{
			int sum=0;
			for(int j=0;j<ncols;j++)
			{
				sum+=arr[i][j];
			}
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		int arr[][]=new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		rowsum(arr);
	}
}
