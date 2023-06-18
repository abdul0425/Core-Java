package edu.jspider.July07;

public class BinaryImplement {

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		System.out.println(bst.add(10));
		System.out.println(bst.add(50));
		System.out.println(bst.add(60));
		System.out.println(bst.add(50));
		System.out.println(bst.add(20));
		System.out.println(bst.add(30));
		
		// Traversing Bst.
		bst.levelOrderTraversal();
		System.out.println();
		// Pre Order Traversal.
		bst.preOrderTraversal();
	}

}
