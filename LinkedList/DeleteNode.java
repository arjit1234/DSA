package LinkedList;
import java.util.*;
public class DeleteNode
{
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
	public static void print(Node<Integer> head)
	{
		Node<Integer> temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
			
	}
	public static Node<Integer> deleteNode(Node<Integer> head,int pos)
	{
		if(head==null)
		{
			return head;
		}
		if(pos==0)
		{
			return head.next;
		}
		int count=0;
		Node<Integer> currenthead=head;
		while(currenthead!=null && count<(pos-1))
		{
			currenthead=currenthead.next;
			count++;
		}
		if(currenthead==null && currenthead.next==null)
		{
			return head;
		}
		currenthead.next=currenthead.next.next;
		return head;
	}
	public static void main(String[] args) {
		Node<Integer> head=takeinput();
		Node<Integer> head1=deleteNode(head,2);
		print(head1);
	}
}
