package SearchingSorting;
import java.util.*;
public class PushZeroToEnd 

{
	
		public static void pushzerotoend(int arr[])
		{
			
			int nonzero=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=0)
				{
					int temp=arr[i];
					arr[i]=arr[nonzero];
					arr[nonzero]=temp;
					nonzero++;
				}
				
			}
		}
		public static void printarray(int arr[])
		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int arr1[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr1[i]=sc.nextInt();
			}
			
			pushzerotoend(arr1);
			printarray(arr1);
		}
}
