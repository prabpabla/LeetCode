public class Add_Binary {
	
	/*
	 * Given two binary strings a and b, return their sum as a binary string.
	 * 
	 * Input: a = "11", b = "1"
	 * Output: "100"
	 * 
	 * Input: a = "1010", b = "1011"
	 * Output: "10101"
	 * 
	 * 1 <= a.length, b.length <= 104
	 * a and b consist only of '0' or '1' characters.
	 * Each string does not contain leading zeros except for the zero itself.
	 */

	public static String addBinary(String a, String b) {
        /*
         * This solution does not work for extremely large inputs.
        int aDecimal = Integer.parseInt(a,2);
        int bDecimal = Integer.parseInt(b,2);
        int sumDecimal = aDecimal+bDecimal;
        sumBinary = Integer.toBinaryString(sumDecimal);
        return sumBinary;	
        */
		
		String sumBinary = "";
        if (a == "0" && b == "0")
        	return "0";
        else if (a == "0")
        	return b;
        else if (b == "0")
        	return a;
        
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;
        int carry = 0;
        while(aLength >= 0 || bLength >= 0 || carry > 0) {
        	int sum = carry;
        	if(aLength >= 0)
        		//sum += a.charAt(aLength--) - '0';
        		//Adding the (unicode value of char at (length) - unicode value of'0') to Sum
        		sum += Character.getNumericValue(a.charAt(aLength--));
        	if(bLength >= 0)
        		//sum += b.charAt(bLength--) - '0';
        		sum += Character.getNumericValue(b.charAt(bLength--));
        	sumBinary = (sum%2) + sumBinary;
        	carry = sum/2;
        }
        return sumBinary;
 
    }
	
	public static void main(String[] args) {
		String[] a = {"110111", "10101", "1000000"};
		String[] b = {"1011", "1011", "10101"};
		for(int i = 0; i < a.length; i++) {
			System.out.print("The binary sum of "+a[i]+" and "+b[i]+" is: ");
			System.out.print(addBinary(a[i], b[i])+"\n");
		}
		//System.out.println(addBinary("110111", "1011"));
	}
}
