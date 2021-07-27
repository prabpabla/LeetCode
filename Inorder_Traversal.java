import java.util.ArrayList;
import java.util.List;

public class Inorder_Traversal {

	/*
	 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
	 * 
	 * Input: root = [1,null,2,3]
	 * Output: [1,3,2]
	 * 
	 * Input: root = [1,2]
	 * Output: [2,1]
	 * 
	 * Input: root = [1,null,2]
	 * Output: [1,2]
	 * 
	 * The number of nodes in the tree is in the range [0, 100].
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
	
	public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversalHelper(root, list); 
        return list;
    }
	
	 public static void inorderTraversalHelper (TreeNode root, List<Integer> list) {   
		 if(root == null) 
			 return;
		 //In Order Traversal (Pre-In-Post, or Left-In-Right)
		 inorderTraversalHelper(root.left, list);
	     list.add(root.val);
	     inorderTraversalHelper(root.right, list);
	 }
	 
	public static void main(String[] args) {
		//Test 1
		TreeNode tree1 = new TreeNode(1, 
						 new TreeNode(9),
						 new TreeNode(20, new TreeNode(4), new TreeNode(3)));
		System.out.println("In order traversal output of tree1: "+inorderTraversal(tree1));
				
		//Test 2
		TreeNode tree2 = new TreeNode(9, new TreeNode(4), new TreeNode());
		System.out.println("In order traversal output of tree2: "+inorderTraversal(tree2));
		
		//Test 3
		TreeNode tree3 = new TreeNode(1, new TreeNode(), new TreeNode(2, new TreeNode(3), new TreeNode()));
		System.out.println("In order traversal output of tree2: "+inorderTraversal(tree3));

	}
}
