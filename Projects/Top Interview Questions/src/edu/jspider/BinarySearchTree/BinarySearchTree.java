package edu.jspider.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

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
	public int size()
	{
		return count;
	}
	public void levelOrderTraversal()
	{
		Queue<Node> q=new LinkedList<>();
		if(root!=null)
			q.add(root);
		System.out.print("Level Order Traversal  :  ");
		while(!q.isEmpty())
		{
			Node curr=q.poll();
			System.out.print(curr.key+" ");
			if(curr.left!=null)
				q.add(curr.left);
			if(curr.right!=null)
				q.add(curr.right);
		}
		System.out.println();
	}
	public void preOrderTraversal()
	{
		System.out.print("Pre Order Traversal  :  ");
		preOrder(root);
		System.out.println();
	}
	public void preOrder(Node n)
	{
		if(n==null)
			return;
		System.out.print(n.key+" ");
		preOrder(n.left);
		preOrder(n.right);
	}
	public void postOrderTraversal()
	{
		System.out.print("Post Order Traversal  :  ");
		postOrder(root);
		System.out.println();
	}
	public void postOrder(Node n)
	{
		if(n==null)
			return;
		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.key+" ");
	}
	public void inOrderTraversal()
	{
		System.out.print("In Order Traversal  :  ");
		inOrder(root);
		System.out.println();
	}
	public void inOrder(Node n)
	{
		if(n==null)
			return;
		inOrder(n.left);
		System.out.print(n.key+" ");
		inOrder(n.right);
	}
}
