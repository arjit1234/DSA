package BinaryTreeNode;
import java.util.*;
public class BinaryTreeUse
{
	
	
	public static BinaryTreeNode<Integer> takeinputbetter(boolean isRoot,int parentData,boolean isLeft)
	{
		if(isRoot)
		{
			System.out.println("Enter Root Data:");
		}
		else {
			if(isLeft)
			{
				System.out.println("Enter left Child of "+parentData);
			}
			else {
				System.out.println("Enter Right Child of "+parentData);
			}
		}
		Scanner sc=new Scanner(System.in);
		int rootData=sc.nextInt();
		if(rootData==-1)
		{
			return null;
		}
		
		BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
		BinaryTreeNode<Integer> leftChild=takeinputbetter(false, rootData, true);
		BinaryTreeNode<Integer> rightChild=takeinputbetter(false, rootData, false);
		root.left=leftChild;
		root.right=rightChild;
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
	public static void main(String[] args) {
//		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(1);
//		
//		BinaryTreeNode<Integer> rootleft=new BinaryTreeNode<Integer>(2);
//		BinaryTreeNode<Integer> rootright=new BinaryTreeNode<Integer>(3);
//		root.left=rootleft;
//		root.right=rootright;
//		
//		BinaryTreeNode<Integer> tworight=new BinaryTreeNode<Integer>(4);
//		BinaryTreeNode<Integer> threeleft=new BinaryTreeNode<Integer>(5);
//		
//		rootleft.right=tworight;
//		rootright.left=threeleft;
		BinaryTreeNode<Integer> root=takeinputbetter(true, 0, true);
		print(root);
	}
}
