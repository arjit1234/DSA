package LinkedList2;
import java.util.*;
public class DeleteNodeRecursively {
	
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
		public static Node<Integer> delete(Node<Integer> head,int pos)
		{
			if(head==null)
			{
				return head;
			}
			
			if(pos==0)
			{
				return head.next;
			}
			else {
//				Node<Integer> 
				head.next=delete(head.next,pos-1);
				
				return head;
			}
		}
			
		public static void print(Node<Integer> head)
		{
			if(head==null) return;
			System.out.print(head.data+" ");
			print(head.next);
			
		}
		public static void main(String[] args) {
			Node<Integer> head=takeinput();
			Node<Integer> ans=delete(head,2);
			print(ans);
		}
}
