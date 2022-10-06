package BinaryTreeNode;
import java.util.*;
public class PostOrder {
	
	public static BinaryTreeNode<Integer> takeinput(boolean isRoot,int ParentData,boolean isleft)
	{
		if(isRoot)
		{
			System.out.println("Enter Root Data ");
		}
		else 
		{
			if(isleft)
			{
				System.out.println("Enter the left child of "+ParentData);
			}
			else {
				System.out.println("Enter the right child of "+ParentData);
			}
		}
		Scanner sc=new Scanner(System.in);
		int rootData=sc.nextInt();
		if(rootData==-1)
		{
			return null;
		}
		
		BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
		BinaryTreeNode<Integer> leftchild=takeinput(false,rootData,true);
		BinaryTreeNode<Integer> rightchild=takeinput(false,rootData,false);
		root.left=leftchild;
		root.right=rightchild;
		
		return root;
		
	}
	public static void PostOrder(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		PostOrder(root.left);
		PostOrder(root.right);
		System.out.print(root.data+" ");
	}
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root=takeinput(true,0,true);
		PostOrder(root);
	}
}
