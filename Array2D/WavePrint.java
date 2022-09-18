package Array2D;
import java.util.*;
public class WavePrint 
{
	
	public static int[][] takeinput()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number of Rows:");
		int rows=sc.nextInt();
		System.out.println("Enter the Number of Cols:");
		int cols=sc.nextInt();
		
		int arr[][]=new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.println("Enter the "+i+" th row "+j+" th col");
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	
	public static void waveprint(int input[][])
	{
		int row=input.length;
		int col=input[0].length;
		for(int j=0;j<col;j++)
		{
			if(j%2==0)
			{
				for(int i=0;i<row;i++)
				{
					System.out.print(input[i][j]+" ");
				}
				System.out.println();
			}else {
				for(int i=row-1;i>=0;i--)
				{
					System.out.print(input[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		
		int input[][]=takeinput();
		WavePrint.waveprint(input);
		
	}
}
