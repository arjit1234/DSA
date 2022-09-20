package Stack;

public class StackUse 
{
	public static void main(String[] args) throws StackFullException, StackEmptyException {
		
//		StackUsingArray stack=new StackUsingArray(100);
		StackUsingLL stack=new StackUsingLL<>();
		int arr[] ={57,89,34,56,87};
		
		for(int i=0;i<arr.length;i++)
		{
			stack.push(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(stack.pop());
		}
		
//		stack.push(10);
//		stack.push(30);
//		stack.push(40);
//		System.out.println(stack.size());
//		System.out.println(stack.pop());
//		System.out.println(stack.isEmpty());
//		System.out.println(stack.size());
	}
}
 