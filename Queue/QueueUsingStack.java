package Queue;
import java.util.Queue;
import java.util.LinkedList;
public class QueueUsingStack {

	public Queue<Integer> q1;
	public Queue<Integer> q2;
	
	public QueueUsingStack() {
		// TODO Auto-generated constructor stub
		this.q1=new LinkedList<>();
		this.q2=new LinkedList<>();
	}
	public int getSize()
	{
		return this.q1.size();
	}
	public boolean isEmpty()
	{
		return this.getSize()==0;
	}
	public void push(int element)
	{
		this.q1.add(element);
	}
	public int pop()
	{
		if(this.isEmpty())
		{
			return -1;
		}
		while(this.q1.size()>1)
		{
			this.q2.add(this.q1.poll());
		}
		int ans=this.q1.poll();
		
		Queue<Integer> temp=this.q1;
		this.q1=this.q2;
		this.q2=temp;
		return ans;
	}
	public int top()
	{
		if(this.isEmpty()) {
			return -1;
		}
		while(this.q1.size()>1)
		{
			this.q2.add(this.q1.poll());
		}
		int ans=q1.poll();
		q2.add(ans);
		
		Queue<Integer> temp=this.q1;
		this.q1=this.q2;
		this.q2=temp;
		
		return ans;
	}
}
