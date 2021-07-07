import java.util.Arrays;

public class Longest_Common_Prefix {
	/*
	 * Write a function to find the longest common prefix string amongst an array of strings.
	 * If there is no common prefix, return an empty string "".
	 * 
	 * 1 <= strs.length <= 200
	 * 0 <= strs[i].length <= 200
	 * strs[i] consists of only lower-case English letters.
	 */
	
	public static void main(String[] args) {

		String[] strs = {"dog","racecar","car"};
		String commonPrefix = "";
		int strsLen = strs.length;
		
		if(strsLen == 0)
			System.out.println("");
		if(strsLen == 1)
			System.out.println(strs[0]);
		
		Arrays.sort(strs);
		int smallestSize = Math.min(strs[0].length(), strs[strsLen - 1].length());
		System.out.println(smallestSize);
		
		for (int i = 0; i < smallestSize; i++) {
			if(strs[0].charAt(i) == strs[strsLen - 1].charAt(i))
				commonPrefix += (strs[0].charAt(i));
			else 
				break;
		}
		System.out.println(commonPrefix);

	}
}
