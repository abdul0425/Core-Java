package edu.jspider.July16;
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
	
	public void levelOrderTraversal()
	{
		Queue<BinaryNode> q=new LinkedList<BinaryNode>();
		if(root!=null)
			q.add(root);
		while(!q.isEmpty())
		{
			BinaryNode curr=q.poll();
			System.out.println(curr.key);
			if(curr.left!=null)
				q.add(curr.left);
			else
				q.add(curr.right);
		}
	}
	public void preOrderTraversal()
	{
		preOrder(root);
		System.out.println();
	}
	public void preOrder(BinaryNode n)
	{
		if(n==null)return;
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
		if(n==null)return;
		
		preOrder(n.left);
		preOrder(n.right);
		System.out.print(n.key+" ");
	}
	public void inOrderTraversal()
	{
		preOrder(root);
		System.out.println();
	}
	public void inOrder(BinaryNode n)
	{
		if(n==null)return;
		
		preOrder(n.left);
		System.out.print(n.key+" ");
		preOrder(n.right);
	}
}
