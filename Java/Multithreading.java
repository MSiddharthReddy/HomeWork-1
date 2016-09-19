package queue;
import java.util.Scanner;

public class Multithreading {
	public static void main(String [] args){
		@SuppressWarnings("resource")
		Scanner readInput = new Scanner(System.in);		
		System.out.println("Enter the number of multiples to be printed");
		String number = readInput.nextLine();
		System.out.println("Enter the no 1 of which of multiples to be printed");
		String number1 = readInput.nextLine();
		System.out.println("Enter the no 2 of which of multiples to be printed");
		String number2 = readInput.nextLine();
		
		Boolean error = multiples(number, number1, number2);
		if(error)
		{
			System.out.println("Unexpected error occured");
		}
	}

	public static Boolean multiples(String numberString, String number1, String number2)
	{
		Boolean error = false;
		try{
			int number = Integer.parseInt(numberString);
			Print pr = new Print();
			Scanner readInput = new Scanner(System.in);
			int num1 = Integer.parseInt(number1);
			int num2 = Integer.parseInt(number2);
			Thread threadOne = new Thread(new Multiples(pr, number, num1));
			Thread threadTwo = new Thread(new Multiples(pr, number, num2));

			threadOne.start();
			threadTwo.start();
		}
		catch(Exception E)
		{
			error = true;
		}
		return error;
	}
}
