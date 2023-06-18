package edu.jspider.Aug12;

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
		BinaryNode prev=null;
		BinaryNode curr=root;
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
}
