package leetcode938;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinarySearchTree {

	// declare reference will be node
	TreeNode root;

	public void traverse() {
		if (root != null) {
			TreeNode nodeToTraverse = root;

			inorder(nodeToTraverse);
		}
	}

	private void inorder(TreeNode node) {
		
		if (node.left != null) {
			inorder(node.left);
		}

		System.out.print(node.val + " ");

		if (node.right != null) {
			inorder(node.right);
		}
	}
	
	// Iteratively in order
    public List<Integer> inorderTraversalLoop(TreeNode root){
        List<Integer> result = new ArrayList<Integer>();
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        TreeNode current = root;
        
        // The loop will not end until stack is empty, it stack is not empty, that means its on the bottom left node
        while(current != null || !stack.empty()){
            // Add all the left node to the stack
            while(current != null){
                stack.add(current);
                current = current.left;
            }
            
            // current will be whatever on the top of the stack, which is the lastest node that was visited
            current = stack.pop();
            
            // If it gets here, that means its the left most node, then middle node, then right node
            result.add(current.val);
            
            // Check the right node now, if current is null, then it will just pop the stack
            current = current.right;
        }
        
        return result;
    }

	public void addTreeNode(int value) {
		TreeNode nodeToAdd = new TreeNode(value);

		if (root == null) {
			root = nodeToAdd;
		}

		traverseAndAddNode(root, nodeToAdd);
	}

	private void traverseAndAddNode(TreeNode node, TreeNode nodeToAdd) {
		if (nodeToAdd.val < node.val) {
			if (node.left == null) {
				node.left = nodeToAdd;
			} else {
				traverseAndAddNode(node.left, nodeToAdd);
			}
		} else if (nodeToAdd.val > node.val) {
			if (node.right == null) {
				node.right = nodeToAdd;
			} else {
				traverseAndAddNode(node.right, nodeToAdd);
			}
		}
	}
}
