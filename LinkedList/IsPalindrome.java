package LinkedList;
import java.util.*;
public class IsPalindrome {
	
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
	public static Node<Integer> getmid(Node<Integer> head)
	{
		Node<Integer> slow=head;
		Node<Integer> fast=head;
		while(head!=null && head.next!=null)
		{
			head=head.next.next;
			slow=slow.next;
		}
		return slow;
	}
	public static Node<Integer> reverse(Node<Integer> head)
	{
		Node<Integer> curr=head;
		Node<Integer> fwd=null;
		Node<Integer> prev=null;
		while(curr!=null)
		{
			fwd=curr.next;
			curr.next=prev;
			prev=curr;
			curr=fwd;
		}
		return prev;
	}
	public static boolean checkpalindrome(Node<Integer> head)
	{
		if(head.next==null)
		{
			return true;
		}
		
		Node<Integer> mid=getmid(head);
		
		Node<Integer> temp=mid.next;
		mid.next=reverse(temp);
		
		Node<Integer> head1=head;
		Node<Integer> head2=mid.next;
		while(head2!=null)
		{
			if(head2.data!=head1.data)
			{
				return false;
			}
			head1=head1.next;
			head2=head2.next;
		}
		
		temp=mid.next;
		mid.next=reverse(temp);
		
		return true;
	}
	public static void main(String[] args) {
		Node<Integer> head=takeinput();
		if(checkpalindrome(head))
		{
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
}
