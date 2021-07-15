import com.sun.org.apache.bcel.internal.classfile.Node;

public class Same_Tree {
	
	/*
	 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
	 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
	 * 
	 * Ex. 1 				Ex. 2				Ex. 3
	 *      1		1			 1		1			 1		1
	 *     / \	   / \			/		 \			/ \	   / \
	 *    2   3   2   3		   2		  2		   2   1  1   2
	 * Output: True			Output: False		Output: False
	 * 
	 * The number of nodes in both trees is in the range [0, 100].
	 * -10^4 <= Node.val <= 10^4
	 */
	
	
	//Binary tree nodes, with left and right
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		//Null constructor
		TreeNode() {			
		}
		//Node constructor
		TreeNode(int val) { 
			this.val = val; 
		}
		//Tree constructor
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
		 	this.right = right;
		}
	}
	
	//Helper TreeNode function (not necessary, included in TreeNode class)
	public static TreeNode newTreeNode(int val, TreeNode left, TreeNode right) {
		TreeNode treeNode = new TreeNode();
		treeNode.val = val;
		treeNode.left = left;
		treeNode.right = right;
		return treeNode;
	}
	
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) 
			return true;
	    if (q == null || p == null) 
	    	return false;
	    boolean val = (p.val == q.val);
	    boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);

        return val && left && right;
	}
	
	public static void main(String[] args) {
		
		//First way to instantiate TreeNode object
		TreeNode tree1 = new TreeNode();
		tree1.val = 10;
		tree1.left = new TreeNode(11);
		//tree1.left.val = 11;
		tree1.right = new TreeNode(12);
		//tree1.left.val = 12;
		
		//Second way to instantiate TreeNode object
		TreeNode tree2 = new TreeNode(10);
		tree2.left = new TreeNode(11);
		tree2.right = new TreeNode(12);
		
		//Third way to instantiate TreeNode object
		TreeNode tree3 = new TreeNode(10, new TreeNode(11), new TreeNode(12));
		
		//Fourth way to instantiate TreeNode
		TreeNode tree4 = newTreeNode(10, new TreeNode(11), new TreeNode(12));
		
		if (isSameTree(tree1, tree2))
	        System.out.printf("Both trees are the same \n");
	    else
	        System.out.printf("Trees are not the same \n");
		
		if (isSameTree(tree3, tree4))
	        System.out.printf("Both trees are the same \n");
	    else
	        System.out.printf("Trees are not the same \n");
		
	}

}
