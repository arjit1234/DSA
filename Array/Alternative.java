package Array;

public class Alternative 
{
	public static int[] alternative(int arr[])
	{
		
		for(int i=0;i<arr.length;i=i+2)
		{
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		return arr;
	}
	public static void main(String[] args) {
		int arr[]= {2,3,5,6,8,9,1,2};
		int ans[]=alternative(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
