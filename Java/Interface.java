package queue;
import java.util.Scanner;

public class Interface {



		public static void main(String[] args) {

			Scanner input;
			int in;
			do{
				System.out.println("Enter 1 to calculate area of circle");
				System.out.println("Enter 2 to calculate area of rectangle");
				

				input = new Scanner(System.in);
				Double area = 0.0;
				in = Integer.parseInt(input.nextLine());
				switch (in)
				{
				case 1: 
					System.out.println("Enter the radius of the circle");
					int radius = Integer.parseInt(input.nextLine());
					area = calCircle(radius);
					System.out.println("The area of circle is " + area);
					break;
				case 2: 
					System.out.println("Enter the length of the Rectangle");
					int length = Integer.parseInt(input.nextLine());
					System.out.println("Enter the breadth of the circle");
					int breadth = Integer.parseInt(input.nextLine());
					area = calRectangle(length,breadth);
					System.out.println("The area of rectangle is " + area);
					break;
				case 4:
					System.exit(0);
					break;
				default: 
					System.out.println("Enter a valid input");
					break;
				}
			}while(in != 4);
		}

		public static Double calCircle(int radius)
		{
			Circle circle = new Circle(radius);
			Double areaOfCircle = circle.calculate();
			return areaOfCircle;
		}

		public static Double calRectangle(int length, int breadth)
		{
			Rectangle rectangle = new Rectangle(length, breadth);
			Double areaOfRectangle = rectangle.calculate();
			return areaOfRectangle;
		}
	

}
