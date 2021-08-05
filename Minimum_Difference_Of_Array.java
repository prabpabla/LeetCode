import java.util.Arrays;
public class Minimum_Difference_Of_Array {
 
	/*
	 * Given an array of distinct integers arr, return the minimum absolute difference of any two elements
	 */
	
	public static int minimumAbsDifference(int[] arr) {
		if(arr.length < 2)
        	return -1;
	
		Arrays.sort(arr); // nlog(n)
        int minDifference = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length - 1; i++){
            int difference = Math.abs(arr[i+1] - arr[i]);
            if (difference == 0)
            	return 0;
            if(difference < minDifference)
                minDifference = difference;
        }
        return minDifference;	        
	}
	
	public static void main(String[] args) {
		int[][] nums = {{-2,1,-3,4,-1,2,1,-5,4}, {4,-1,2,1}, {5,10,-1,7,100}, {-1,-2,-10,-4,1,10}, {0}};
		for(int[] num : nums){
			System.out.print("The min difference in the array "+Arrays.toString(num)+" is ");
			System.out.print(minimumAbsDifference(num)+"\n");
		}
	}

}
