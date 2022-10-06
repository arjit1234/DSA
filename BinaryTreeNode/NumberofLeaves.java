package BinaryTreeNode;
import java.util.*;
public class NumberofLeaves {

	public static BinaryTreeNode<Integer> takeinput(boolean isRoot,int ParentRoot,boolean isleft)
	{
		if(isRoot)
		{
			System.out.println("Enter Parent Node:");
		}
		else {
			if(isleft)
			{
				System.out.println("Enter left child of "+ParentRoot);
			}else {
				System.out.println("Enter Right child of "+ParentRoot);
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
	public static int Leavescount(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		if(root.left==null && root.right==null)
		{
			return 1;
		}
		
		return (Leavescount(root.left)+Leavescount(root.right));
	}
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root=takeinput(true,0,true);
	
		System.out.println("Number of Leaves "+Leavescount(root));
	}
}
