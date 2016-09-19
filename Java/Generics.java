package queue;

import java.util.Scanner;

public class Generics{

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner input,reader;
		int in;
		String count;
		Boolean res;
		do{
			System.out.println("Enter 1 to Enter integers");
			System.out.println("Enter 2 to Enter characters");
			System.out.println("Enter 3 to exit");

			input = new Scanner(System.in);
			in = Integer.parseInt(input.nextLine());
			switch (in)
			{
			case 1: 
				System.out.println("Enter the number of elements");
				reader = new Scanner(System.in);
				count = reader.nextLine();
				Integer integerArray[] = new Integer[Integer.parseInt(count)];
				for(int i=0; i<Integer.parseInt(count);i++)
				{
					System.out.println("Enter element " + i);
					integerArray[i] = Integer.parseInt(reader.nextLine());
				}
				res = palindrome(integerArray);
				if(res){
					System.out.println("Enter Values are a Pallindrome ");
				}
				else
				{
					System.out.println("Enter Values are Not a Pallindrome ");
				}
				break;
			case 2:
				
				System.out.println("Enter the number of elements");
				reader = new Scanner(System.in);
				count = reader.nextLine();
				String charArray[] = new String[Integer.parseInt(count)];
				for(int i=0; i<Integer.parseInt(count);i++)
				{
					System.out.println("Enter element " + i);
					charArray[i] = reader.nextLine();
				}
				res = palindrome(charArray);
				if(res){
					System.out.println("Enter Values are a Pallindrome ");
				}
				else
				{
					System.out.println("Enter Values are Not a Pallindrome ");
				}
				
				break;
			case 3:
				System.exit(0);
				break;
			default: 
				System.out.println("Invalid input");
				break;
			} 
		}while(in != 3);
	}

	public static <E extends Comparable<E>> Boolean palindrome(E[] array)
	{
		Boolean res = true;
		for (int i=0;i<array.length;i++)
		{
			
				if ( !(array[i].equals( array[array.length - 1 - i] ))){
					res = false;
				}
		}

		return res;
	}
}
