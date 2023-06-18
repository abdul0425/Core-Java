package edu.jspider.Sep18;

public class BinarySearchImplementation {

	public static void main(String[] args) {
		//BinarySearchTree bst=new BinarySearchTree();
		BinarySearchTreeUsingRecursion bst=new BinarySearchTreeUsingRecursion();
		//bst.add(60);
		System.out.println("Result 60 :  "+bst.add(60));
		//bst.add(50);
		System.out.println("Result 50 :  "+bst.add(50));
		//bst.add(90);
		System.out.println("Result 90 :  "+bst.add(90));
		//bst.add(70);
		System.out.println("Result 70 :  "+bst.add(70));
		//bst.add(20);
		System.out.println("Result 20 :  "+bst.add(20));
		//bst.add(30);
		System.out.println("Result 30 :  "+bst.add(30));
		//bst.add(50);
		System.out.println("Result 50 :  "+bst.add(50));
		//bst.add(30);
		System.out.println("Result 30 :  "+bst.add(30));
		
		System.out.println("=========================================");
		// In-Order Traversal.
		System.out.print("In-Order Traversal  :  ");
		bst.levelOrderTraversal();
		System.out.println("=========================================");
		// Pre-Order Traversal.
		System.out.print("Pre-Order Traversal  :  ");
		bst.preOrderTraversal();
		System.out.println("=========================================");
		// Post Order Traversal.
		System.out.print("Post Order Traversal  :  ");
		bst.postOrderTraversal();
		System.out.println("=========================================");
		// In Order Traversal.
		System.out.print("In Order Traversal  :  ");
		bst.inOrderTraversal();
		System.out.println("=========================================");
	}

}
