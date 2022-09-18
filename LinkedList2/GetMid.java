package LinkedList2;
import java.util.*;
public class GetMid
{
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
	public static int getmid(Node<Integer> head)
	{
		Node<Integer> slow=head;
		Node<Integer> fast=head;
		while(fast.next!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow.data;
	}
	public static void main(String[] args) {
		Node<Integer> head=takeinput();
		int ans=getmid(head);
		System.out.println(ans);
	}
}
