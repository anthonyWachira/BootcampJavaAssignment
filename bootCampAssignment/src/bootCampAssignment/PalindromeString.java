package bootCampAssignment;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String str, reverse = "";
		Scanner in = new Scanner(System.in);
		int length;		
		System.out.println("Please Enter string");
		str = in.nextLine();
		length = str.length();
		
		for(int i = length -1; i>=0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("reverse is: " +reverse);
		
		if(str.equals(reverse)) 
			System.out.println("The string is a Palindrome");
		else
			System.out.println("The string is not a Palindrome");
		
	}

}
