package edu.jspider.BinarySearchTree;

public class Node {
	int key;
	Node left;
	Node right=null;
	
	Node(int k)
	{
		key=k;
	}
	Node(Node l)
	{
		left=l;
	}
}
