package BinaryTreeNode;
import java.util.*;
public class Nodesum
{
	public static BinaryTreeNode<Integer> takeinput(boolean isRoot,int ParentData,boolean isleft)
	{
		if(isRoot)
		{
			System.out.println("Enter Parent Node:");
		}
		else {
			if(isleft)
			{
				System.out.println("Enter left child of "+ParentData);
			}
			else {
				System.out.println("Enter Right Child of "+ParentData);
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
	public static int getsum(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		int leftsum=getsum(root.left);
		int rightsum=getsum(root.right);
		
		return (leftsum+rightsum+root.data);
	}
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root=takeinput(true,0,true);
		print(root);
		System.err.println("Sum of Nodes:"+getsum(root));
	}
}
