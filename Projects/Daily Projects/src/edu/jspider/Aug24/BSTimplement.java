package edu.jspider.Aug24;

public class BSTimplement {

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		System.out.println(bst.add(50));
		System.out.println(bst.add(40));
		System.out.println(bst.add(60));
		System.out.println(bst.add(30));
		System.out.println(bst.add(90));
		System.out.println(bst.add(50));
		
		System.out.println(bst.size());
	}
}
