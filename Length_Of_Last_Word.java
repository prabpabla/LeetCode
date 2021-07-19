public class Length_Of_Last_Word {

	/*
	 * Given a string s consists of some words separated by spaces, return the length of the last word in the string. 
	 * If the last word does not exist, return 0.
	 * A word is a maximal substring consisting of non-space characters only.
	 * 
	 * 1 <= s.length <= 10^4
	 * s consists of only English letters and spaces ' '
	 */
	
	public static int lengthOfLastWord(String s) {
        if (s.isBlank())
        	return 0;
		String[] sArray = s.split(" ");
        return sArray[sArray.length - 1].length();
    }

	
	public static void main(String[] args) {
		String s = "Hello, how are you doing?";
		System.out.println(s);
		System.out.println("The length of the last word is "+lengthOfLastWord(s));

	}
}
