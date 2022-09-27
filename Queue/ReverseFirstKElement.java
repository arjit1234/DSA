package Queue;
import java.util.*;
public class ReverseFirstKElement {

	
	public static Queue<Integer> kreverse(Queue<Integer> input,int k)
	{
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<k;i++)
		{
			stack.push(input.poll());
		}
		
		while(!stack.isEmpty())
		{
			input.add(stack.pop());
		}
		for(int i=0;i<input.size()-k;i++)
		{
			input.add(input.poll());
		}
		return input;
	}
	public static void main(String[] args) {
		Queue<Integer> q1=new LinkedList<Integer>();
		int arr[]= {1,2,3,4,5};
		for(int elem:arr)
		{
			q1.add(elem);
		}
		Queue<Integer> ans=kreverse(q1,3);
		
		while(!ans.isEmpty())
		{
			System.out.print(ans.poll()+" ");
		}
	}
}
