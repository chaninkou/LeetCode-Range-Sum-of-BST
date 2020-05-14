package leetcode938;


public class Main {
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		
		
		// 1,3,4,6,7,8,10,13,14
		
		tree.addTreeNode(10);
		tree.addTreeNode(5);
		tree.addTreeNode(15);
		tree.addTreeNode(3);
		tree.addTreeNode(7);
		tree.addTreeNode(18);
		
		tree.traverse();
		
		int L = 7;
		int R = 15;
		
		System.out.println("\nL: " + L + " R: " + R);
		
		FindRangeOfSumFunction solution = new FindRangeOfSumFunction();
		
		System.out.println("\nSolution: " + solution.rangeSumBST(tree.root, L, R));
		
	}
}
