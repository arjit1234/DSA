package LinkedList2;
import java.util.*;
public class InterSectionPointYshapedLinkedList {

	public static Node<Integer> takeinput()
	{
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Node<Integer> head=null,tail=null;
		while(data!=1)
		{
			Node<Integer> currentNode=new Node<>(data);
			if(head==null)
			{
				head=currentNode;
				tail=currentNode;
			}else {
				tail.next=currentNode;
				tail.next=currentNode;
			}
			data=sc.nextInt();
		}
		return head;
	}
	public static int intersectionPoint(Node<Integer> head1,Node<Integer> head2)
	{
		Node<Integer> ptr1=head1;
		Node<Integer> ptr2=head2;
		int c1=0;
		int c2=0;
		while(ptr1!=null)
		{
			c1++;
			ptr1=ptr1.next;
		}
		while(ptr2!=null)
		{
			c2++;
			ptr2=ptr2.next;
		}
		ptr1=head1;
		ptr2=head2;
		int diff=Math.abs(c1-c2);
		
		if(c1>c2)
		{
			for(int i=0;i<diff;i++)
			{
				ptr1=ptr1.next;
			}
		}
		else if(c2>c1) {
			for(int i=0;i<diff;i++)
			{
				ptr2=ptr2.next;
			}
		}
		
		while(ptr1!=ptr2)
		{
			ptr1=ptr1.next;
			ptr2=ptr2.next;
		}
		if(ptr1!=null)
		{
			return ptr1.data;
		}else {
			return -1;
		}
	}
	public static void main(String[] args) {
		Node<Integer> head1=takeinput();
		Node<Integer> head2=takeinput();
		
		int ans=intersectionPoint(head1,head2);
		System.out.println(ans);
	}
}
