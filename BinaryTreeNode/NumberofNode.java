package BinaryTreeNode;
import java.util.*;
public class NumberofNode {

	public static BinaryTreeNode<Integer> takeinput(boolean isRoot,int parentData,boolean isleft)
	{
		if(isRoot)
		{
			System.out.println("Enter Parent Node:");
		}
		else {
			if(isleft)
			{
				System.out.println("Enter left child of:"+parentData);
			}else {
				System.out.println("Enter Right Node:"+parentData);
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
			System.out.print("L"+root.left.data+",");
		}
		if(root.right!=null)
		{
			System.out.print("R"+root.right.data);
		}
		System.out.println();
		print(root.left);
		print(root.right);
	}
	public static int NodeCount(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		int leftNodeCount=NodeCount(root.left);
		int rightNodeCount=NodeCount(root.right);
		return 1+leftNodeCount+rightNodeCount;
		
	}
	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root=takeinput(true,0,true);
		print(root);
		System.out.println("Number of Node:"+NodeCount(root));
	}
}
