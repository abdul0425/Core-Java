package edu.jspider.Sep19;

public class Node {

	int key;
	Node left;
	Node right;
	
	Node(int k)
	{
		key=k;
	}
	Node(Node l,Node r)
	{
		left=l;
		right=r;
	}
}
