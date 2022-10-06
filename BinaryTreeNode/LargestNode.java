package BinaryTreeNode;
import java.util.*;
public class LargestNode {
	public static BinaryTreeNode<Integer> takeinput(boolean isRoot,int ParentData,boolean isleft)
	{
		if(isRoot)
		{
			System.out.println("Enter root Data");
		}
		else {
			if(isleft)
			{
				System.out.println("Enter left child of "+ParentData);
			}else {
				System.out.println("Enter right child of "+ParentData);
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
	public static int largest(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return -1;
		}
		
		int leftlarge=largest(root.left);
		int rightlarge=largest(root.right);
		
		return Math.max(root.data,Math.max(leftlarge, rightlarge));
		
	}
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root=takeinput(true,0,true);
		System.out.println("Largest Node:"+largest(root));
	}
}
