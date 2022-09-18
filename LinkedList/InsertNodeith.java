package LinkedList;
import java.util.*;
public class InsertNodeith {
	
	public static Node<Integer> takeinput()
	{
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Node<Integer> head=null,tail=null;
		while(data!=-1)
		{
			Node<Integer>  currentNode=new Node<Integer>(data);
			if(head==null)
			{
				head=currentNode;
				tail=currentNode;
			}else {
//				Node<Integer> tail=head;
//				while(tail.next!=null)
//				{
//					tail=tail.next;
//				}
				tail.next=currentNode;
				tail=currentNode;
			}
				
			data=sc.nextInt();
		}
		return head;
	}
	public static Node<Integer> Insert(Node<Integer> head,int element,int pos)
	{
		Node<Integer> nodetoinserted=new Node<Integer>(element);
		if(pos==0)
		{
			nodetoinserted.next=head;
			return nodetoinserted;
		}else {
			int count=0;
			Node<Integer> prev=head;
			while(count<pos-1 && prev!=null)
			{
				prev=prev.next;
				count++;
			}
			if(prev!=null)
			{
				nodetoinserted.next=prev.next;
				prev.next=nodetoinserted;
			}
			return head;
		}
	}
	public static void print(Node<Integer> head)
	{
		Node<Integer> temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
	public static void main(String[] args) {
	
		Node<Integer> head=takeinput();
		Node<Integer> head1=Insert(head,80,2);
		print(head1);
	}
}
