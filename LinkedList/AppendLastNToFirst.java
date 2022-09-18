package LinkedList;
import java.util.*;
public class AppendLastNToFirst 
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
	public static Node<Integer> append(Node<Integer> head,int n)
	{
		if(n==0 || head==null)
		{
			return head;
		}
		
		Node<Integer> fast=head;
		Node<Integer> slow=head;
		Node<Integer> Intialhead=head;
		for(int i=0;i<n;i++)
		{
			fast=fast.next;
		}
		
		while(fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next;
		}
		
		Node<Integer> temp=slow.next;
		slow.next=null;
		fast.next=Intialhead;
		head=temp;
		
		return head;
	}
	public static void print(Node<Integer> head)
	{
		Node<Integer> temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Node<Integer> head=takeinput();
		int n=sc.nextInt();
		Node<Integer> ans=append(head,n);
		print(ans);
	}
}
