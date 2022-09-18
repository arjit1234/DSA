package LinkedList2;
import java.util.*;
public class FindNodeRecursively {
		
	public static Node<Integer> takeinput()
	{
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Node<Integer> head=null,tail=null;
		while(data!=-1)
		{
			Node<Integer> currentNode=new Node<Integer>(data);
			
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
	public static int findNode(Node<Integer> head,int n)
	{
		if(head==null) return -1;
		
		if(head.data.equals(n)) return 0;
		
	    int smallans=findNode(head.next,n);
	    
	    if(smallans==-1) return -1;
	    
	    return smallans+1;
	}
	public static void main(String[] args) {
		Node<Integer> head=takeinput();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Element to find");
		int n=sc.nextInt();
		int ans=findNode(head,n);
		System.out.println(ans);
	}
}

