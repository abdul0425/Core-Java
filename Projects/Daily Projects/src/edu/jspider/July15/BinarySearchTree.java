package edu.jspider.July15;
import java.util.Queue;
import java.util.LinkedList;
public class BinarySearchTree {

	private BinaryNode root;
	private int count;
	
	public boolean add(int k)
	{
		if(root==null)
		{
			root=new BinaryNode(k);
			count++;
			return true;
		}
		BinaryNode curr=root;
		BinaryNode prev=null;
		while(curr!=null)
		{
			prev=curr;
			if(k<curr.key)
				curr=curr.left;
			else if(k>curr.key)
				curr=curr.right;
			else
				return false;
		}
		if(k<prev.key)
			prev.left=new BinaryNode(k);
		else
			prev.right=new BinaryNode(k);
		count++;
		return true;
	}
	
	// Level Order Traversal
	public void levelOrderTraversal()
	{
		Queue<BinaryNode> q=new LinkedList<BinaryNode>();
		if(root!=null)
			q.add(root);
		System.out.print("Level Order Traversal  :  ");
		while(!q.isEmpty())
		{
			BinaryNode curr=q.poll();
			System.out.print(curr.key+" ");
			if(curr.left!=null)
				q.add(curr.left);
			if(curr.right!=null)
				q.add(curr.right);
		}
	}
	
	public void preOdredTraversal()
	{
		preOrder(root);
		System.out.println();
	}
	public void preOrder(BinaryNode n)
	{
		if(n==null)
			return;
		System.out.print(n.key+" ");
		preOrder(n.left);
		preOrder(n.right);
	}
	public void postOrderTraversal()
	{
		postOrder(root);
		System.out.println();
	}
	public void postOrder(BinaryNode n)
	{
		if(n==null)
			return;
		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.key+" ");
	}
	public void inOrderTraversal()
	{
		inOrder(root);
		System.out.println();
	}
	public void inOrder(BinaryNode n)
	{
		if(n==null)
			return;
		postOrder(n.left);
		System.out.print(n.key+" ");
		postOrder(n.right);
		
	}
}
