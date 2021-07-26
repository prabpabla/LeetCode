public class Max_Depth_Binary_Tree {

	/*
	 * Given the root of a binary tree, return its maximum depth.
	 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
	 * 
	 * Input: root = [3,9,20,null,null,15,7]
	 * Output: 3
	 * 
	 * The number of nodes in the tree is in the range [0, 10^4].
	 * -100 <= Node.val <= 100
	 */
		
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {			
		}
		TreeNode(int val) { 
			this.val = val; 
		}
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
		 	this.right = right;
		}
	}
	
	public static int maxDepth(TreeNode root) {
		if (root == null)
            return 0;
		return Math.max(maxDepth(root.right), maxDepth(root.left)) + 1;
    }
	
	public static void main(String[] args) {
		//Test 1
		TreeNode tree1 = new TreeNode(1, 
				 		 new TreeNode(9, new TreeNode(), new TreeNode()),
				 		 new TreeNode(20, new TreeNode(4), new TreeNode(3)));
		System.out.println("The max depth of tree1 is: "+maxDepth(tree1));
		
		//Test 2
		TreeNode tree2 = new TreeNode(9, new TreeNode(4), new TreeNode());
		System.out.println("The max depth of tree2 is: "+maxDepth(tree2));
	}
}
