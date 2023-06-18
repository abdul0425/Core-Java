package edu.jspider.Sep18;

public class BinaryNode {

	int key;
	BinaryNode left;
	BinaryNode right;
	
	BinaryNode(int key)
	{
		this.key=key;
	}
	BinaryNode(BinaryNode l)
	{
		left=l;
	}
	BinaryNode(BinaryNode r,BinaryNode l)
	{
		right=r;
		l=null;
	}
}
