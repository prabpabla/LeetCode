
public class Implement_strStr {

	/*
	 * Implement strStr().
	 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
	 * Clarification:
	 * What should we return when needle is an empty string? This is a great question to ask during an interview.
	 * For the purpose of this problem, we will return 0 when needle is an empty string. 
	 * This is consistent to C's strstr() and Java's indexOf().
	 * 
	 * 0 <= haystack.length, needle.length <= 5 * 104
	 * haystack and needle consist of only lower-case English characters.
	 */
	
	public static int strStr(String haystack, String needle) {
        if(haystack == null || needle == null)
        	return 0;
        int needleLen = needle.length();
        int haystackLen = haystack.length();
        //Loop through 
        for(int i = 0; i <= haystackLen-needleLen; i++) {
        	int j = 0;
        	while(j < needleLen && haystack.charAt(i+j) == needle.charAt(j)) {
        		j++;
        	}
        	if (j == needleLen)
        		return i;
        }
        return -1;
    }
	
	public static void main(String[] args) {
		System.out.println(strStr(null, null));
		System.out.println(strStr("hello", "ll"));
		System.out.println(strStr("aaaaa", "bba"));
		
	}

}
