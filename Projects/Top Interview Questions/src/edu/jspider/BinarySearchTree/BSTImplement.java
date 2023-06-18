package edu.jspider.BinarySearchTree;

public class BSTImplement {

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		System.out.println(bst.add(50));
		System.out.println(bst.add(90));
		System.out.println(bst.add(40));
		System.out.println(bst.add(80));
		System.out.println(bst.add(30));
		System.out.println(bst.add(70));
		System.out.println(bst.add(50));
		System.out.println(bst.add(30));
		
		System.out.println("=====================");
		bst.levelOrderTraversal();
		System.out.println("=====================");
		bst.preOrderTraversal();
		System.out.println("=====================");
		bst.postOrderTraversal();
		System.out.println("=====================");
		bst.inOrderTraversal();
		System.out.println("=====================");
	}
}
