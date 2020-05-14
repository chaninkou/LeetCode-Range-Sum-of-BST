package leetcode938;

import java.util.LinkedList;
import java.util.Queue;

public class FindRangeOfSumFunction {
	// simple bfs with queue with some condition
	public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null){
            return 0;
        }
        
        int sum = 0;
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.offer(root);
        
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            
            if(current.val >= L && current.val <= R){
                sum += current.val;
            }
            
            if(current.left != null && current.val > L){
                queue.offer(current.left);
            }
            
            if(current.right != null && current.val < R){
                queue.offer(current.right);
            }
        }
        
        return sum;   
    }
}
