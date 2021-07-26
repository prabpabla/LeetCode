public class Min_Depth_Binary_Tree {
	
	
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
	
	public static int minDepth(TreeNode root) {
		if (root == null)
            return 0;
		int right = minDepth(root.right);
		int left = minDepth(root.left);
		if (right == 0 || left == 0)
			return right + left + 1;
		return Math.min(right, left) + 1;
    }
	
	public static void main(String[] args) {
		//Test 1
		TreeNode tree1 = new TreeNode(1, 
				 		 new TreeNode(9),
				 		 new TreeNode(20, new TreeNode(4), new TreeNode(3)));
		System.out.println("The min depth of tree1 is: "+minDepth(tree1));
		
		//Test 2
		TreeNode tree2 = new TreeNode(9, new TreeNode(4), new TreeNode());
		System.out.println("The min depth of tree2 is: "+minDepth(tree2));
	}

}
