package Stack;
import java.util.*;
public class StackUsingArray {

	private int data[];
	private int topIndex;
	
	public StackUsingArray()
	{
		data=new int[10];
		topIndex=-1;
	}
	public StackUsingArray(int size)
	{
		data=new int[size];
		topIndex=-1;
	}
	
	public int size()
	{
		return topIndex+1;
	}
	public void push(int element) throws StackFullException
	{
		if(topIndex==data.length)
		{
//			StackFullException e=new StackFullException();
//			
//			throw e;
//			throw new StackFullException();
			doubleCapacity();
		}
		data[++topIndex]=element;
	}
	private void doubleCapacity() {
		// TODO Auto-generated method stub
		int temp[]=data;
		data=new int[2*temp.length];
		for(int i=0;i<temp.length;i++)
		{
			data[i]=temp[i];
		}
	}
	public int pop() throws StackEmptyException
	{
		if(topIndex==-1) {
			throw new StackEmptyException();
		}
		int temp= data[topIndex];
		topIndex--;
		return temp;
	}
	public int top() throws StackEmptyException
	{
		if(topIndex==-1) {
			throw new StackEmptyException();
		}
		return data[topIndex];
	}
	public boolean isEmpty() {
		return topIndex==-1;
	}
}
