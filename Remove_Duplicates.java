import java.util.Arrays;
public class Remove_Duplicates {

	/*
	 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
	 * The relative order of the elements should be kept the same.
	 * Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. 
	 * More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. 
	 * It does not matter what you leave beyond the first k elements.
	 * Return k after placing the final result in the first k slots of nums.
	 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
	 */
	
	public static int removeDuplicates(int[] nums) {
		
		if (nums.length == 0)
            return 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
        	if(i < nums.length-1 && nums[i] == nums[i+1]) {
        		continue;
        	}
        	nums[temp] = nums[i];
            temp++;
        }
        return temp;
    }
	
	public static void main(String[] args) {

		int[] numsTest = new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 5, 5, 7};
		int testLen = removeDuplicates(numsTest);
		System.out.print("Without Duplicate Array: ");
		for(int i = 0; i < testLen; i++) {
			System.out.print(numsTest[i] + " ");
		}
	}
}
