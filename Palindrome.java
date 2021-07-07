
public class Palindrome {
	
	/*
	 * Given an integer x, return true if x is palindrome integer.
	 * An integer is a palindrome when it reads the same backward as forward. 
	 * For example, 121 is palindrome while 123 is not.
	 * -2^31 <= x <= 2^31 - 1
	 */
	
	public static void main(String[] args) {
		
		int x = -10201;
		int temp = x;
		int rev = 0;
		int remainder = 0;
		
		if (x < 0 || (x % 10 == 0 && x != 0))
            System.out.println("False");
		
		while(x != 0) {
			remainder = x % 10;  
			rev = rev * 10 + remainder;  
			x = x/10;  
			//System.out.println(rev + " " + x);
		}
		
		String res = rev == temp ? "True" : "False";
		
		System.out.println(res);
	}
}
