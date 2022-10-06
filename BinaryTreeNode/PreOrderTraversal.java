package BinaryTreeNode;
import java.util.*;
public class PreOrderTraversal {

	
		public static BinaryTreeNode<Integer> takeinput(boolean isRoot,int ParentData,boolean isleft)
		{
			if(isRoot)
			{
				System.out.println("Enter Parent Node:");
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
		public static void preorder(BinaryTreeNode<Integer> root)
		{
			if(root==null)
			{
				return;
			}
			
				System.out.print(root.data+" ");
				preorder(root.left);
				preorder(root.right);
		
		}
		public static void main(String[] args) {
			BinaryTreeNode<Integer> root=takeinput(true,0,true);
			preorder(root);
		}
}
