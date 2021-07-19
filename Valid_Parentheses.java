public class Valid_Parentheses {

	/*
	 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
	 * An input string is valid if:
	 * Open brackets must be closed by the same type of brackets.
	 * Open brackets must be closed in the correct order.
	 * 
	 * 1 <= s.length <= 10^4
	 * s consists of parentheses only '()[]{}'.
	 */
	
	public static boolean isValid(String s) {
		String sSub = "";
		if(s.isEmpty())
            return true;
		if(s.length()%2 != 0)
			return false; 

			if(s.contains("()"))
				sSub = s.replace("()","");
			else if(s.contains("[]"))
				sSub = s.replace("[]","");
			else if(s.contains("{}"))
				sSub = s.replace("{}","");
			else {
				return false;
			}
			return isValid(sSub);
    }
	
	public static void main(String[] args) throws Exception{
		String[] sArray = {"()", "()()", "(())", "(()[])", "[{()[]}([{}])]{}","[[", "{}{{})"};
		for (String s : sArray) {
			System.out.print("The pattern "+s+" ");
				if(isValid(s))
					System.out.println("is valid");
				else
					System.out.println("is NOT vaild");	
		}	
	}
}
