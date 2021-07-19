import java.util.Arrays;

public class Search_Insert {
	
	/*
	 * Given a sorted array of distinct integers and a target value, return the index if the target is found. 
	 * If not, return the index where it would be if it were inserted in order.
	 * You must write an algorithm with O(log n) runtime complexity.
	 * 
	 * Input: nums = [1,3,5,6], target = 5
	 * Output: 2
	 * Input: nums = [1,3,5,6], target = 7
	 * Output: 4
	 * 
	 * 1 <= nums.length <= 10^4
	 * -10^4 <= nums[i] <= 10^4
	 * nums contains distinct values sorted in ascending order.
	 * -10^4 <= target <= 10^4
	 */
	
	//Iterative Binary Search
	public static int searchInsertIterative(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high) {
        	//int mid = (high + low)/2; can result in overflow problem, for array with 2^30 or more elements
        	int mid = low + (high - low)/2;
        	if (nums[mid] < target) 
				low = mid + 1;
        	else if (nums[mid] > target)
        		high = mid - 1;
        	else if (nums[mid] == target)
        		return mid;
        }
        return low;
    }
	
	//Recursive Binary Search
	public static int searchInsertRecursive(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        return searchRecursiveHelper(nums, target, low, high);
    }
	
	public static int searchRecursiveHelper(int[] nums, int target, int low, int high) {
		if(low <= high) { 
		    int mid = low + (high - low)/2;
		    if (nums[mid] < target) { 
				low = mid + 1;
				return searchRecursiveHelper(nums, target, low, high);
			}
		    else if (nums[mid] > target) {
		        high = mid - 1;
		        return searchRecursiveHelper(nums, target, low, high);
		    }
		    else if (nums[mid] == target)
		        return mid;
		}
	        return low;
	}
	
	public static void main(String[] args) {
		int[][] nums = {{1,2,3,4}, {1,2,4,8}, {3,4,5,6}};
		int target = 5;
		for(int[] num : nums){
			System.out.print("The target "+target+" should appear in the array "+Arrays.toString(num)+" at index ");
			System.out.print(searchInsertRecursive(num, target) +"\n");
		}
	}
}
