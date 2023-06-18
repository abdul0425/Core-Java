package collection6;

public class BSTimplements {

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		System.out.println(bst.add(50));
		System.out.println(bst.add(90));
		System.out.println(bst.add(40));
		System.out.println(bst.add(80));
		System.out.println(bst.add(30));
		System.out.println(bst.add(70));
		System.out.println(bst.add(40));
		System.out.println(bst.add(60));
		
		bst.levelOrderTraversal();
		bst.preOrderTraversal();
		bst.postOrderTraversal();
		bst.inOrderTraversal();
	}
}
