package queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queues {

	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		System.out.println("Enter the string #1");
		Scanner inputReader = new Scanner(System.in);
		String string1 = inputReader.nextLine();
		System.out.println(string1);
		System.out.println("Enter the string #2");
		String string2 = inputReader.nextLine();
		System.out.println(string2);

		Boolean res = checkEquals(string1, string2);

		if(res)
		{
			System.out.println("Strings are Equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
	}

	public static Boolean checkEquals(String string1, String string2)
	{
		Boolean res = false;
		int s1 = string1.length();
		int s2 = string2.length();
		if(s1 == s2){
		String st1 = "";
		
		Queue<Object> charQueue1 = new LinkedList<>();

		for(int i=0;i<s1;i++)
		{
			charQueue1.add(string1.charAt(i));
		}

		while(!charQueue1.isEmpty())
			st1= st1 + charQueue1.remove();
		
		System.out.println(st1);
		if(st1.equals(string2))
		{
			res = true;
		}
		else
		{
			res = false;
		}
		
	}
		else{
			res = false;
		}
		
		return res;
	}
}

