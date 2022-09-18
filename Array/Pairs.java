package Array;

public class Pairs 
{
	
	
	public static void printarray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				System.out.println("("+arr[i]+","+arr[j]+")");
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {2,1,4,7,8,9};
		
		printarray(arr);
	}
}
