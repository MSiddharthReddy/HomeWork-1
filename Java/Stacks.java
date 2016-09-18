package queue;

import java.util.Stack;
import java.util.Scanner;


public class Stacks {
	
	public static void main(String args[])
	{
		System.out.println("Enter the string");
		@SuppressWarnings("resource")
		Scanner inputReader = new Scanner(System.in);
		String s = inputReader.nextLine();
		
		Boolean res = checkPalindrome(s);

		if(res)
		{
			System.out.println("Entered String is a palindrome");
		}
		else
		{
			System.out.println("Entered string is not a palindrome");
		}
		

		
	}
	public static Boolean checkPalindrome(String string)
	{
		Boolean result = false;
		int sLen = string.length();
		String s1 = "";
		Stack<Character> charStack = new Stack<Character>();

		for(int i=0;i<sLen;i++)
		{
			charStack.push(string.charAt(i));
		}

        while (!charStack.isEmpty()) {
            s1 += charStack.pop();
        }
		if(s1.equals(string))
		{
			result = true;
		}
		else
		{
			result = false;
		}
		return result;
	}
	
}
