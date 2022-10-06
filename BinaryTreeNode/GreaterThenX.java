package BinaryTreeNode;
import java.util.*;
public class GreaterThenX {

	public static BinaryTreeNode<Integer> takeinput(boolean isRoot,int ParentData,boolean isleft)
	{
		if(isRoot)
		{
			System.out.println("Enter Parent Node: ");
		}
		else {
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
	public static void print(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+":");
		if(root.left!=null)
		{
			System.out.print(root.left.data+",");
		}
		if(root.right!=null)
		{
			System.out.print(root.right.data);
		}
		System.out.println();
		print(root.left);
		print(root.right);
	}
	public static int greater(BinaryTreeNode<Integer> root,int x)
	{
		if(root==null)
		{
			return 0;
		}
		
		int count=(root.data>x) ? 1:0;
		if(root.left!=null)
		{
			count+=greater(root.left,x);
		}
		if(root.right!=null)
		{
			count+=greater(root.right,x);
		}
		return count;
		
	}
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root=takeinput(true,0,true);
		print(root);
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("No of element are :"+greater(root,x));
		
	}
}
