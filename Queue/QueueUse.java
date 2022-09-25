package Queue;


public class QueueUse
{
	public static void main(String[] args)  {
		QueueUsingArray queue=new QueueUsingArray();
		int arr[]= {10,20,30,40,50};
		for(int i=0;i<arr.length;i++)
		{
			try {
				queue.enqueue(arr[i]);
			}
			catch(QueueFullException e)
			{
				
			}
		}
		
		while(!queue.isEmpty())
		{
			
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				
			}
		}
	}
}
