package edu.jspider.Aug16;

public class BinaryNode {

	int key;
	BinaryNode left;
	BinaryNode right;
	
	BinaryNode(int k)
	{
		key=k;
	}
	BinaryNode(BinaryNode l)
	{
		left=l;
	}
	BinaryNode(BinaryNode r,BinaryNode l)
	{
		right=r;
		left=null;
	}
}
