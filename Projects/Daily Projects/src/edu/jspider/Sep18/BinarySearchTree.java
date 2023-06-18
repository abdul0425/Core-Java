package edu.jspider.Sep18;
import java.util.*;
public class BinarySearchTree {

	private BinaryNode root;
	private int count;
	
	
	// Adding Element to the Node.
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
	
	public int size()
	{
		return count;
	}
	
	// Breadth-First Traversal.
	// Level Order Traversal.
	public void levelOrderTraversal()
	{
		Queue<BinaryNode> q=new LinkedList();
		if(root!=null)
			q.add(root);
		while(!q.isEmpty())
		{
			BinaryNode curr=q.poll();
			System.out.print(curr.key+" ");
			
			if(curr.left!=null)
				q.add(curr.left);
			if(curr.right!=null)
				q.add(curr.right);
		}
		System.out.println();
	}
	
	// Depth-First Search.
	// Pre-Order Traversal.
	public void preOrderTraversal()
	{
		preOrder(root);
		System.out.println();
	}
	private void preOrder(BinaryNode n)
	{
		if(n==null)
			return;
		System.out.print(n.key+" ");
		preOrder(n.left);
		preOrder(n.right);
	}
	
	// Post-Order Traversal.
	public void  postOrderTraversal()
	{
		postOrder(root);
		System.out.println();
	}
	private void postOrder(BinaryNode n)
	{
		if(n==null)
			return;
		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.key+" ");
	}
	
	// In-Order Traversal.
	public void inOrderTraversal()
	{
		inOrder(root);
		System.out.println();
	}
	private void inOrder(BinaryNode n)
	{
		if(n==null)
			return;
		inOrder(n.left);
		System.out.print(n.key+" ");
		inOrder(n.right);
	}
	
}
