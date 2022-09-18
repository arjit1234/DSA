package LinkedList2;
import java.util.*;
public class SwapNode {

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
	public static Node<Integer> swap(Node<Integer> head,int i,int j)
	{
		if(i==j)
		{
			return head;
		}
		Node<Integer> currentNode=head,prev=null;
		Node<Integer> firstNode=null,secondNode=null,firstNodePrev=null,secondNodePrev=null;
		
		int pos=0;
		while(currentNode!=null)
		{
			if(pos==i)
			{
				firstNodePrev=prev;
				firstNode=currentNode;
			}
			else if(pos==j)
			{
				secondNodePrev=prev;
				secondNode=currentNode;
			}
			prev=currentNode;
			currentNode=currentNode.next;
			pos+=1;
		}
		if(firstNodePrev!=null)
		{
			firstNodePrev.next=secondNode;
		}else {
			head=secondNode;
		}
		if(secondNodePrev!=null)
		{
			secondNodePrev.next=firstNode;
		}
		else {
			head=firstNode;
		}
		Node<Integer> temp=secondNode.next;
		secondNode.next=firstNode.next;
		firstNode.next=temp;
		
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
		Node<Integer> head=takeinput();
		Node<Integer> ans=swap(head,1,3);
		print(ans);
	}
}
