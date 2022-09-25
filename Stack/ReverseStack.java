package Stack;
import java.util.*;
public class ReverseStack {

	
	public static void reverse(Stack<Integer> input,Stack<Integer> extra)
	{
		if(input.size()<=1)  return;
		
		int lastelement=input.pop();
		
		reverse(input,extra);
		
		while(!input.isEmpty())
		{
			int top=input.pop();
			extra.push(top);
		}
		
		input.push(lastelement);
		
		while(!extra.isEmpty())
		{
			int top=extra.pop();
			input.push(top);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {5,4,6,7,8,9};
		Stack<Integer> stack=new Stack<Integer>();
		Stack<Integer> extra=new Stack<Integer>();
		for(int element:arr)
		{
			
			stack.push(element);
		}
		
		
		reverse(stack,extra);
		
		while(!stack.isEmpty())
		{
			System.out.print(stack.pop()+" ");
		}
	}

}
