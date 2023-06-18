package edu.jspider.July08;
import java.util.Queue;
import java.util.LinkedList;
public class BinarySearchTree {
	private Node root;
	private int count;
	
	
	public boolean add(int k)
	{
		if(root==null)
		{
			root=new Node(k);
			count++;
			return true;
		}
		Node curr=root;
		Node prev=null;
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
			prev.left=new Node(k);
		else
			prev.right=new Node(k);
		count++;
		return true;
	}
	
	// Breadth-First Search Traversing method :
	// Level-Order Traversal.
	
	public void levelOrderTraversal()
	{
		Queue<Node> q=new LinkedList<Node>();
		if(root!=null)
			q.add(root);
		System.out.println("Level Orde Traversal  :  ");
		while(!q.isEmpty())
		{
			Node curr=q.poll();
			System.out.println(curr.key);
			
			if(curr.left!=null)
				q.add(curr.left);
			if(curr.right!=null)
				q.add(curr.right);
		}
	}
	
	// Breadth-First Search.
	// 1. Pre-Order Traversal.
	public void preOrderTraversal()
	{
		System.out.println("Pre Order Traversal");
		preOrder(root);
		System.out.println();
	}
	public void preOrder(Node n)
	{
		if(n==null)return;
		System.out.println(n.key);
		if(n.left!=null)
			preOrder(n.left);
		if(n.right!=null)
			preOrder(n.right);
	}
	
	// 2. PostOrderTraversal
	public void postOrderTraversal()
	{
		System.out.println("Post Order Traversal  :  ");
		preOrder(root);
		System.out.println();
	}
	public void postOrder(Node n)
	{
		if(n==null)
			return;
		postOrder(n.left);
		System.out.println(n.key);
		preOrder(n.right);
	}
	
	// 3. InOrder-Traversal.
	public void inOrderTraversal()
	{
		System.out.println("In Order Traversal  :  ");
		inOrder(root);
		System.out.println();
	}
	public void inOrder(Node n)
	{
		if(n==null)
			return;
		inOrder(n.left);
		inOrder(root);
		System.out.println(n.key);
	}
}
