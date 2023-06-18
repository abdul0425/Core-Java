package edu.jspider.July07;
import java.util.*;
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
		{
			prev.left=new Node(k);
		}
		else
		{
			prev.right=new Node(k);
		}
		count++;
		return true;
	}
	
	//Breadth-First Search.
	// Level Order Traversal.
	public void levelOrderTraversal()
	{
		Queue<Node> q=new LinkedList<Node>();
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
			
	}
	
	// Depth-First Search
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
}
