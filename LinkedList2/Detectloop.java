package LinkedList2;
import java.util.*;
public class Detectloop {

	
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
	public static boolean checkloop(Node<Integer> head)
	{
		Node<Integer> low=head;
		Node<Integer> high=head;
		while(high!=null && high.next!=null)
		{
			high=high.next.next;
			low=low.next;
			if(low==high)
			{
				return true;
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		Node<Integer> head=takeinput();
		if(checkloop(head))
		{
			System.out.println("Loop Detected");
		}else {
			System.out.println("Loop Not Detected");
		}
	}
}
