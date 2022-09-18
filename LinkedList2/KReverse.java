package LinkedList2;
import java.util.*;
public class KReverse {
	
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
	public static Node<Integer> kreverse(Node<Integer> head,int k)
	{
		if(k==0 || k==1)
		{
			return head;
		}
		int count=0;
		Node<Integer> curr=head;
		Node<Integer> fwd=null;
		Node<Integer> prev=null;
		
		while(count<k && curr!=null)
		{
			fwd=curr.next;
			curr.next=prev;
			prev=curr;
			curr=fwd;
			count++;
		}
		if(fwd!=null)
		{
			head.next=kreverse(fwd,k);
		}
		return prev;
	}
	public static void print(Node<Integer> head)
	{
		if(head==null) return;
		System.out.print(head.data+" ");
		print(head.next);
	}
	public static void main(String[] args) {
		Node<Integer> head=takeinput();
		head=kreverse(head,3);
		print(head);
	}
}
