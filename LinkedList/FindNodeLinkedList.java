package LinkedList;
import java.util.*;
public class FindNodeLinkedList {

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
	public static int findnode(Node<Integer> head,int n)
	{
		if(head==null)
		{
			return -1;
		}
		int i=0;
		while(head!=null)
		{
			if(head.data.equals(n))
			{
				return i;
			}
			head=head.next;
			i++;
		}
		return -1;
	}
public static void main(String[] args) {
		Node<Integer> head=takeinput();
//		print(head);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=findnode(head,n);
		System.out.println(ans);
	}
}
