package Stack;
import java.util.*;
public class StockSpan {
	
	public static int[] stock(int []price)
	{
		Stack<Integer> stk=new Stack<>();
		int n=price.length;
		
		int[] output=new int[n];
		
		stk.push(0);
		output[0]=1;
		
		for(int i=1;i<n;i++)
		{
			while(!stk.isEmpty() && price[stk.peek()]<price[i])
			{
				stk.pop();
			}
			
			if(stk.isEmpty())
			{
				output[i]=i+1;
			}
			else {
				output[i]=i-stk.peek();
			}
			stk.push(i);
		}
		return output;
	}
	public static void main(String[] args) {
		int arr[]= {4,5,3,2,11,8,9,15,17};
		
		int ans[]=stock(arr);
		System.out.println(ans);
	}
}
