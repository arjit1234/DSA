package LinkedList;

public class LinkedListUse 
{
	
	public static Node<Integer> createLinkedList()
	{
		Node<Integer> n1=new Node<>(10);
		Node<Integer> n2=new Node<>(20);
		Node<Integer> n3=new Node<>(30);
		Node<Integer> n4=new Node<>(40);
		n1.next=n2;
//		System.out.println("n1"+n1+" Data "+n1.data+" next "+n1.next);
		n2.next=n3;
//		System.out.println(" n2 "+n2+" Data "+n2.data+" next "+n2.next);
		n3.next=n4;
//		System.out.println(" n3 "+n3+" Data "+n3.data+" next "+n3.next);
//		System.out.println(" n4 "+n4+" Data "+n4.next+" next "+n4.next);
		return n1;
	}
	public static void increment(Node<Integer> head)
	{
		head=new Node<Integer>(100);
		head.data++;
	}
	public static void print(Node<Integer> head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	public static int length(Node<Integer> head)
	{
		Node<Integer> temp=head;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
	}
	public static void main(String[] args) {
		
		Node<Integer> head=createLinkedList();
		increment(head);
		print(head);
		int ans=length(head);
		System.out.println(ans);
//		Node<Integer> n1=new Node<>(10);
//		System.out.println(n1);
//		System.out.println(n1.data);
//		System.out.println(n1.next);
		
	}
}
