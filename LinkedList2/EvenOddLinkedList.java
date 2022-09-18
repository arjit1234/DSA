package LinkedList2;
import java.util.*;
public class EvenOddLinkedList {

	public static Node<Integer> takeinput()
	{
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Node<Integer> head=null,tail=null;
		while(data!=-1)
		{
			Node<Integer> currentNode=new Node<>(data);
			if(head==null)
			{
				head=currentNode;
				tail=currentNode;
			}
			else {
				tail.next=currentNode;
				tail=currentNode;
			}
			data=sc.nextInt();
		}
		return head;
	}
	public static Node<Integer> evenafterodd(Node<Integer> head)
	{
		if(head==null)
		{
			return head;
		}
		
		Node<Integer> evenhead=null,eventail=null,oddhead=null,oddtail=null;
		
		while(head!=null)
		{
			if(head.data%2==0)
			{
				if(evenhead==null)
				{
					evenhead=head;
					eventail=head;
				}
				else {
					eventail.next=head;
					eventail=eventail.next;
				}
			}
			else {
				if(oddhead==null)
				{
					oddhead=head;
					oddtail=head;
				}else {
					oddtail.next=head;
					oddtail=oddtail.next;
				}
			}
			head=head.next;
		}
		if(oddhead==null)
		{
			return evenhead;
		}
		else {
			oddtail.next=evenhead;
		}
		if(evenhead!=null)
		{
			eventail.next=null;
		}
		return oddhead;
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
		Node<Integer> ans=evenafterodd(head);
		print(ans);
	}
}
