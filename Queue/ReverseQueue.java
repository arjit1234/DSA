package Queue;
import java.util.*;
public class ReverseQueue
{
	public static void reversequeue(Queue<Integer> q1)
	{
		if(q1.size()<=1)
		{
			return;
		}
		int front=q1.poll();
		reversequeue(q1);
		q1.add(front);
	}
	public static void main(String[] args) throws QueueEmptyException {
		
		Queue<Integer> queue=new LinkedList<>(); 
		int arr[]= {10,20,30,40,50};
		for(int elem:arr)
		{
			queue.add(elem);
		}
		
		reversequeue(queue);
		
		while(!queue.isEmpty())
		{
			System.out.print(queue.poll()+" ");
		}
	}
}
