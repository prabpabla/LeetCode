import java.io.IOException;

public class Reverse {
	/*
	 * Given a signed 32-bit integer x, return x with its digits reversed. 
	 * If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
	 * -2^31 <= x <= 2^31 - 1
	 */
	
	public static void main(String[] args) throws IOException {
		int x = 1534236469;
		long rev = 0;
		int remainder = 0;
		while(x != 0)   
		{  
		remainder = x % 10;  
		rev = rev * 10 + remainder;  
		x = x/10;  
		//System.out.println(rev + " " + x + " "+ remainder);
		}  
		
		if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) 
			System.out.println(0);
        else 
            System.out.println(rev);
	}
	
}
