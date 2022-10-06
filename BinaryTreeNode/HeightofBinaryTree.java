package BinaryTreeNode;
import java.util.*;
public class HeightofBinaryTree {

	public static BinaryTreeNode<Integer> takeinput(boolean isRoot,int ParentData,boolean isleft)
	{
		if(isRoot)
		{
			System.out.println("Enter Parent Data:");
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
		
		BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
		BinaryTreeNode<Integer> leftchild=takeinput(false,rootData,true);
		BinaryTreeNode<Integer> rightchild=takeinput(false,rootData,false);
		root.left=leftchild;
		root.right=rightchild;
		return root;
	}
	public static int height(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		return Math.max(height(root.left), height(root.right))+1;
	}
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root=takeinput(true,0,true);
		System.out.println("Height of Tree "+height(root));
	}
}
