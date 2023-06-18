package edu.jspider.Sep19;
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
		Node prev=root;
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
		
	}
}
