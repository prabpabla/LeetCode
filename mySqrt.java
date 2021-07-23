public class mySqrt {
	/*
	 * Given a non-negative integer x, compute and return the square root of x.
	 * Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
	 * Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
	 * 
	 * Input: x = 8
	 * Output: 2
	 * Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
	 * 
	 * 0 <= x <= 2^31 - 1
	 */

    public static int mySqrt(int x) {
        /* 
         * Newton Raphson Method
         * Starting with x = sqrt(num) -> x^2 = 2 -> x^2 - 2 = 0
         * f(x) = x^2 - num
         * num in this case is the integer we are calculating sqrt for
         * f(x) =  x^2 - num -> f'(x) = 2x
         * therefore x_n = x_(n-1) - f(x_(n-1))/f'(x_(n-1))
         * therefore x_(n+1) = x - f(x)/f'(x)
         * -> x_(n+1) = x - (x^2 - num)/(2x)
         * -> x_(n+1) = x - x^2/(2x) + num/(2x)
         * -> x_(n+1) = x - x/2 + num/(2x)
         * -> x_(n+1) = x/2 + num/(2x)
         * -> x_(n+1) = (x + num/x)/2
         */
    	
    	
    	long sqrt = x;
        while(sqrt*sqrt > x) {
        	sqrt = (sqrt + (x/sqrt))/2;
        }
        return (int)sqrt;
    }
	
	public static void main(String[] args) {
		System.out.println(mySqrt(8));
	}

}
