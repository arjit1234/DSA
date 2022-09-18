package LinkedList2;
import java.util.*;
public class ReverseRecursively {

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
	static Node<Integer> reverse(Node<Integer> head)
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		Node<Integer> smallhead=reverse(head.next);
		Node<Integer> tail=smallhead;
		while(tail.next!=null)
		{
			tail=tail.next;
		}
		tail.next=head;
		head.next=null;
		return smallhead;
	}
	static void print(Node<Integer> head)
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
		head=reverse(head);
		print(head);
	}
}
