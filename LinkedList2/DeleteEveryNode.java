package LinkedList2;
import java.util.*;
public class DeleteEveryNode {

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
	public static Node<Integer> deleteeverynode(Node<Integer> head,int m,int n)
	{
		if(m==0 || head==null)
		{
			return null;
		}
		if(n==0)
		{
			return head;
		}
		Node<Integer> currentNode=head;
		Node<Integer> temp=null;
		while(currentNode!=null)
		{
			int take=0;
			int skip=0;
			
			while(currentNode!=null && take<m)
			{
				if(temp==null)
				{
					temp=currentNode;
				}else {
					temp.next=currentNode;
					temp=currentNode;
				}
				currentNode=currentNode.next;
				take+=1;
			}
			while(currentNode!=null && skip<n)
			{
				currentNode=currentNode.next;
				skip+=1;
			}
			
		}
		if(temp!=null)
		{
			temp.next=null;
		}
		return head;
	}
	public static void print(Node<Integer> head)
	{
		if(head==null)
		{
			return;
		}
		System.out.print(head.data+" ");
		print(head.next);
	}
	public static void main(String[] args) {
		Node<Integer> head=takeinput();
		Node<Integer> ans=deleteeverynode(head,2,3);
		print(ans);
	}
}
