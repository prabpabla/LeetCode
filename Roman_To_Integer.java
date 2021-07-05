import java.util.HashMap;
import java.util.Map;

public class Roman_To_Integer {

	/*
	 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
	 * Symbol       Value
	 * I             1
	 * V             5
	 * X             10
	 * L             50
	 * C             100
	 * D             500
	 * M             1000
	 * 
	 * For example, 2 is written as II in Roman numeral, just two one's added together. 
	 * 12 is written as XII, which is simply X + II. 
	 * The number 27 is written as XXVII, which is XX + V + II.
	 * 
	 * Roman numerals are usually written largest to smallest from left to right. 
	 * However, the numeral for four is not IIII. 
	 * Instead, the number four is written as IV. 
	 * Because the one is before the five we subtract it making four. 
	 * The same principle applies to the number nine, which is written as IX. 
	 * 
	 * There are six instances where subtraction is used:
	 * I can be placed before V (5) and X (10) to make 4 and 9. 
	 * X can be placed before L (50) and C (100) to make 40 and 90. 
	 * C can be placed before D (500) and M (1000) to make 400 and 900.
	 * 
	 * 1 <= s.length <= 15
	 * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
	 * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
	 */
	
	public static void main(String[] args) {
		
		String s = "III";
		Map<Character, Integer> map = new HashMap<>();
		
		map.put('I', 1);
	    map.put('V', 5);
	    map.put('X', 10);
	    map.put('L', 50);
	    map.put('C', 100);
	    map.put('D', 500);
	    map.put('M', 1000);
        
        int res = 0;
        for (int i = 0; i< s.length(); i++) {
        	if (i == 0) {
        		res += map.get(s.charAt(i)); 
        	}   	
        	else if(map.get(s.charAt(i)) > map.get(s.charAt(i-1))) {
        		res += map.get(s.charAt(i)) - 2*map.get(s.charAt(i - 1));
        	}
        	else {
        		res += map.get(s.charAt(i));
			}
        }
        System.out.println(res);
	}
}
