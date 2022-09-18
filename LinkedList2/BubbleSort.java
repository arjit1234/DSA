package LinkedList2;
import java.util.*;
public class BubbleSort {

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
	public static int length(Node<Integer> head)
	{
		int count=0;
		while(head!=null)
		{
			head=head.next;
			count++;
		}
		return count;
			
	}
	public static Node<Integer> BubbleSort(Node<Integer> head)
	{
		int n=length(head);
		
		for(int i=0;i<(n-1);i++)
		{
			Node<Integer> prev=null;
			Node<Integer> curr=head;
			
			for(int j=0;j<(n-i-1);j++)
			{
				if(curr.data <= curr.next.data)
				{
					prev=curr;
					curr=curr.next;
				}
				else {
					if(prev==null)
					{
						Node<Integer> fwd=curr.next;
						head=head.next;
						curr.next=fwd.next;
						fwd.next=curr;
						prev=fwd;
					}
					else {
						Node<Integer> fwd=curr.next;
						prev.next=fwd;
						curr.next=fwd.next;
						fwd.next=curr;
						prev=fwd;
					}
				}
			}
		}
		return head;
	}
	public static void print(Node<Integer> head)
	{
		if(head==null) return;
		System.out.println(head.data);
		print(head.next);
	}
	public static void main(String[] args) {
		Node<Integer> head=takeinput();
		head=BubbleSort(head);
		print(head);
		
	}
	
}
