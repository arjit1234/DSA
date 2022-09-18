package LinkedList;
import java.util.*;
public class RemoveDuplicate {
	
	
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
			}else {
				tail.next=currentNode;
				tail=currentNode;
			}
			data=sc.nextInt();
		}
		return head;
	}
	public static Node<Integer> removeduplicate(Node<Integer> head)
	{
		if(head==null)
		{
			return head;
		}
		
		Node<Integer> currenthead=head;
		while(currenthead.next!=null)
		{
			if(currenthead.data.equals(currenthead.next.data))
			{
				currenthead.next=currenthead.next.next;
			}else {
				currenthead=currenthead.next;
			}
		}
		return head;
	}
	public static void print(Node<Integer> head)
	{
		Node<Integer> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Node<Integer> head=takeinput();
		Node<Integer> ans=removeduplicate(head);
		print(ans);
	}
}
