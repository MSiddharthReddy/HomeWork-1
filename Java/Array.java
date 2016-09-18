package queue;

import java.util.Scanner;

public class Array {
	public static void main(String args[])
	{
		System.out.println("Enter the string");
		@SuppressWarnings("resource")
		Scanner inputReader = new Scanner(System.in);
		String s = inputReader.nextLine();
		
		String res = reverse(s);
		System.out.println(res);		
	}
	
	
	public static String reverse(String string)
	{
		Boolean result = false;
		
		int sLen = string.length();
		
		String s1 = "";
		
		char[] arr = new char[sLen];

		for(int i=0;i<sLen;i++)
		{
			arr[sLen - 1 - i] = string.charAt(i);
		}
		
		String res = new String(arr);
		return res;
	}
	
}
