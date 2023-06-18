package edu.jspider.July15;

public class BSTImplement {

	public static void main(String[] args) {
		BinarySearchTree b=new BinarySearchTree();
		System.out.println(b.add(60));
		System.out.println(b.add(90));
		System.out.println(b.add(30));
		System.out.println(b.add(10));
		System.out.println(b.add(50));
		System.out.println(b.add(90));
		
		b.levelOrderTraversal();
		System.out.println();
		System.out.println("=================================");
		b.postOrderTraversal();
		System.out.println("=================================");
		b.preOdredTraversal();
		System.out.println("=================================");
		b.inOrderTraversal();
		System.out.println("=================================");
	}
}
