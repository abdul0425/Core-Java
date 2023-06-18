package edu.jspider.July08;

public class BSTImplement {

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		System.out.println(bst.add(60));
		System.out.println(bst.add(10));
		System.out.println(bst.add(80));
		System.out.println(bst.add(60));
		System.out.println(bst.add(40));
		System.out.println(bst.add(70));
		
		bst.levelOrderTraversal();
		bst.preOrderTraversal();
	}

}
