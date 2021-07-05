import java.io.*;
import java.util.*;
public class Plus_One {
	/*
	 * Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
	 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
	 * You may assume the integer does not contain any leading zero, except the number 0 itself.
	 * 1 <= digits.length <= 100
	 * 0 <= digits[i] <= 9
	 */
	
	public static void main(String[] args) {
		int[] digits = {1,2,3,9};
		for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9)
                digits[i] = 0;
            else {
                digits[i]++;
                break;
            }
        }
        if (digits[0] == 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            System.out.println(Arrays.toString(newDigits));
        }
        System.out.println(Arrays.toString(digits));

	}

}
