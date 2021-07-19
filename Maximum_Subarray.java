import java.util.Arrays;

public class Maximum_Subarray {

	/*
	 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
	 * 
	 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
	 * Output: 6
	 * Explanation: [4,-1,2,1] has the largest sum = 6.
	 * 
	 * Input: nums = [5,4,-1,7,8]
	 * Output: 23
	 * 
	 * 1 <= nums.length <= 3 * 10^4
	 * -10^5 <= nums[i] <= 10^5
	 */
	
	public static int maxSubArray(int[] nums) {
		if(nums.length == 0)
			return 0;
		if(nums.length == 1)
			return nums[1];
		
		int maxSum = nums[0];
        int sum = nums[0];
		
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] >= sum && sum < 0)
        		sum = nums[i];
        	else 
        		sum += nums[i];
        	if(sum > maxSum)
        		maxSum = sum;
        }
        return maxSum;
    }
	
	public static void main(String[] args) {
		int[][] nums = {{-2,1,-3,4,-1,2,1,-5,4}, {4,-1,2,1}, {5,4,-1,7,8}};
		for(int[] num : nums){
			System.out.print("The max sum in the array "+Arrays.toString(num)+" is ");
			System.out.print(maxSubArray(num)+"\n");
		}
	}
}
