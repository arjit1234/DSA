package LinkedList;
import java.util.*;
public class ithLinkedList {
	
	public static Node<Integer> takeinput()
	{
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Node<Integer> head=null;
		while(data!=-1)
		{
			Node<Integer> currentNode=new Node<Integer>(data);
			if(head==null)
			{
				head=currentNode;
			}
			else {
				Node<Integer> tail=head;
				while(tail.next!=null)
				{
					tail=tail.next;
				}
				tail.next=currentNode;
			}
			
			data=sc.nextInt();
		}
		return head;
	}
	public static void printithelement(Node<Integer> head,int i)
	{
		Node<Integer> temp=head;
		int position=0;
		while(temp!=null && position<i)
		{
			temp=temp.next;
			position++;
		}
		if(temp!=null)
		{
			System.out.println(temp.data);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Node<Integer> head=takeinput();
		int i=sc.nextInt();
		printithelement(head,i);
	}
}
