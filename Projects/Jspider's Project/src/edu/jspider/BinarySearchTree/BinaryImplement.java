package edu.jspider.BinarySearchTree;

public class BinaryImplement {

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		System.out.println(bst.add(50));
		System.out.println(bst.add(40));
		System.out.println(bst.add(20));
		System.out.println(bst.add(50));
		System.out.println(bst.add(90));
		System.out.println(bst.add(60));
		
		
		bst.levelOrderTraversal();
		System.out.println();
		bst.preOrderTraversal();
	}

}
