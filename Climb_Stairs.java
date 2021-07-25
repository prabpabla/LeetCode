public class Climb_Stairs {
	
	/*
	 * You are climbing a staircase. It takes n steps to reach the top.
	 * Each time you can either climb 1 or 2 steps. 
	 * In how many distinct ways can you climb to the top?
	 * 
	 * Input: n = 3
	 * Output: 3
	 * Explanation: There are three ways to climb to the top.
	 * 1. 1 step + 1 step + 1 step
	 * 2. 1 step + 2 steps
	 * 3. 2 steps + 1 step
	 * 
	 * 1 <= n <= 45
	 */
	
	//Ridiculous Brute Force
	/*
	public static int climbStairs(int n) {
        if (n <= 3)
        	return n;
        int m = 0;	
        m = climbStairs(n-1)+climbStairs(n-2);
        return m;    
    }
    */
	
	public static long climbStairs(int n) {
		if (n <= 3)
        	return n;
		long[] step = new long[n];
		step[0]=1;
		step[1]=2;
		for(int i = 2; i <= n-1; i++) {
			step[i] = step[i-1] + step[i-2];
		}
		return step[n-1];
	}
	
	public static void main(String[] args) {
		int[] n = {1,2,3,4,5,6,7,45,100,200};
		for(int m: n) {
			System.out.println(climbStairs(m));
		}
	}

}
