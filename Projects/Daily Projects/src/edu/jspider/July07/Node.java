package edu.jspider.July07;

public class Node {

	int key;
	Node left;
	Node right;
	
	Node(int k)
	{
		key=k;
	}
	Node(Node l)
	{
		left=l;
	}
	Node(Node r,Node l)
	{
		right=r;
		left=l;
	}
}
