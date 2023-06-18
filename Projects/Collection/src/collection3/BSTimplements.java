package collection3;

public class BSTimplements {

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.add(50);
		bst.add(30);
		bst.add(10);
		bst.add(90);
		bst.add(80);
		bst.add(70);
		bst.add(50);
		
		bst.levelOrderTraversal();
		bst.preOrderTraversal();
		bst.postOrderTraversal();
		bst.inOrderTraversal();
	}
}
