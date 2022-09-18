package LinkedList;
import java.util.*;
public class ReverseLinkedList {

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
		public static void reverse(Node<Integer> head)
		{
			if(head==null)
			{
				return;
			}
			
			reverse(head.next);
			System.out.print(head.data+" ");
			
		}
		public static void main(String[] args) {
			Node<Integer> head=takeinput();
			reverse(head);
		}
}
