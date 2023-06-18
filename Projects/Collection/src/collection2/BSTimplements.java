package collection2;

public class BSTimplements {

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		System.out.println("50 - "+bst.add(50));
		System.out.println("90 - "+bst.add(90));
		System.out.println("40 - "+bst.add(40));
		System.out.println("30 - "+bst.add(30));
		System.out.println("70 - "+bst.add(70));
		System.out.println("50 - "+bst.add(50));
		System.out.println("=======================================");
		bst.levelOrderTraversal();
		System.out.println("=======================================");
		bst.preOrderTraversal();
		System.out.println("=======================================");
		bst.postOrderTraversal();
		System.out.println("=======================================");
		bst.inOrderTraversal();
		System.out.println("=======================================");
	}
}
