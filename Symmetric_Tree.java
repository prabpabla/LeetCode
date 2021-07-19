public class Symmetric_Tree {

	/*
	 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
	 * Ex. 1 				Ex. 2			
	 *          1					 1
	 *        /   \                /   \
	 * 		 /     \              /     \
	 *      2		2			 2		 2			
	 *     / \	   / \			  \		  \	
	 *    /   \   /   \            \       \
	 *   3     4 4     3		    3		3
	 * Root=[1,2,2,3,4,4,3] Root=[1,2,2,null,3,null,3]		 
	 * Output: True			Output: False
	 * 
	 * The number of nodes in the tree is in the range [1, 1000].
	 * -100 <= Node.val <= 100		
	 */
	
	//Binary tree nodes, with left and right
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
	
	public static boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return isMirror(root, root);
    }

    public static boolean isMirror(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null || root1.val != root2.val)
            return false;
        boolean left = isMirror(root1.left, root2.right);
        boolean right = isMirror(root1.right, root2.left);
        return left && right;
    }
	
	public static void main(String[] args) {
		//Test 1, of Example 1
		TreeNode tree1 = new TreeNode(1, 
						 new TreeNode(2, new TreeNode(3), new TreeNode(4)),
						 new TreeNode(2, new TreeNode(4), new TreeNode(3)));
		if (isSymmetric(tree1))
	        System.out.printf("Tree1 (Example 1) is symmetric.\n");
	    else
	        System.out.printf("Tree1 (Example 1) is not symmetric.\n");
		
		//Test 2, of Example 2
		TreeNode tree2 = new TreeNode(1, 
					     new TreeNode(2, new TreeNode(), new TreeNode(3)),
						 new TreeNode(2, new TreeNode(), new TreeNode(3)));
		if (isSymmetric(tree2))
			System.out.printf("Tree2 (Example 2) is symmetric.\n");
		else
			System.out.printf("Tree2 (Example 2) is not symmetric.\n");
		
	}
}
