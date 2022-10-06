package BinaryTreeNode;
import java.util.*;
public class ReplaceNodeDepth {

	public static BinaryTreeNode<Integer> takeinput(boolean isRoot,int ParentData,boolean isleft)
	{
		if(isRoot)
		{
			System.out.println("Enter Parent Data");
		}
		else {
			if(isleft)
			{
				System.out.println("Enter left child of "+ParentData);
			}
			else {
				System.out.println("Enter right child of "+ParentData);
			}
		}
		Scanner sc=new Scanner(System.in);
		int rootData=sc.nextInt();
		if(rootData==-1)
		{
			return null;
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftchild=takeinput(false,rootData,false);
		BinaryTreeNode<Integer> rightchild=takeinput(false,rootData,false);
		root.left=leftchild;
		root.right=rightchild;
		return root;
	}
	public static void print(BinaryTreeNode<Integer> root)
	{
		if(root==null) return;
		System.out.print(root.data+":");
		if(root.left!=null ) System.out.print("L"+root.left.data+",");
		if(root.right!=null) System.out.print("R"+root.right.data);
		System.out.println();
		print(root.left);
		print(root.right);
		
	}
	public static void ReplaceNode(BinaryTreeNode<Integer> root,int k)
	{
		if(root==null) return;
		root.data=k;
		
		ReplaceNode(root.left,k+1);
		ReplaceNode(root.right,k+1);
	}
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root=takeinput(true,0,true);
		print(root);
		ReplaceNode(root,0);
		print(root);
	}
}
