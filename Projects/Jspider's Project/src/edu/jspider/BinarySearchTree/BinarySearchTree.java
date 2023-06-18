package edu.jspider.BinarySearchTree;
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
	
	public void preOrderTraversal()
	{
		System.out.print("Pre Order Traversal  :  ");
		preOrder(root);
		System.out.println();
	}
	public void preOrder(Node n)
	{
		if(n==null)return;
		System.out.print(n.key+" ");
		if(n.left!=null)
			preOrder(n.left);
		if(n.right!=null)
			preOrder(n.right);
	}
}
