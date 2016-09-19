package queue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Collection {

		static HashMap<Integer, Student> studentDetails = new HashMap<Integer, Student>();

		@SuppressWarnings("resource")
		public static void main(String[] args)
		{
			Scanner input;
			int in;
			String studentName,sid, fee, merit;

			do{
				System.out.println("Enter 1 to add student");
				System.out.println("Enter 2 to display all the students");
				System.out.println("Enter 3 to calculate the Fee of an student");
				System.out.println("Enter 4 to exit");

				input = new Scanner(System.in);
				in = Integer.parseInt(input.nextLine());
				switch (in)
				{
				case 1: 
					System.out.println("Enter student name");
					studentName = input.nextLine();
					System.out.println("Enter student number");
					sid = input.nextLine();
					System.out.println("Enter student fee");
					fee = input.nextLine();
					System.out.println("Enter Merit Scale");
					merit = input.nextLine();
					Boolean success = addStudent(studentName,sid,fee,merit);
					if(success)
					{
						System.out.println("Detail added successfully");
					}else
					{
						System.out.println("Invalid details.");
					}
					break;
				case 2:
					liststudents();
					break;
				case 3: 
					System.out.println("Enter student number");
					int stdNumber = Integer.parseInt(input.nextLine());
					Double fe = calculateFeeDiscount(stdNumber);
					if(fe == -1)
					{
						System.out.println("student number not found");
					}else
					{
						System.out.println("The fee for the student is " + fe);
					}
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

		public static Boolean addStudent(String studentName,String sid,String fee,String merit)
		{
			Boolean result = true;
			try
			{
				int stdNo = Integer.parseInt(sid);
				int stdfee = Integer.parseInt(fee);
				int stdMerit = Integer.parseInt(merit);
				Student student = new Student(studentName,stdNo,stdfee,stdMerit);
				studentDetails.put(stdNo, student);
			}catch(Exception E)
			{
				result = false;
			}
			return result;
		}

		public static void liststudents()
		{
			if(studentDetails.isEmpty())
			{
				System.out.println("No students are added yet");
			}
			else
			{
				for(Map.Entry<Integer, Student> element : studentDetails.entrySet())
				{
					Student student = element.getValue();
					System.out.println("Emp Number: " + student.sid +" Name: " + student.student + " fee: " + student.fee + " Merit " + student.merit);
				}
			}
		}

		public static Double calculateFeeDiscount(int sid)
		{
			Double fee = -1.0;

			for(Map.Entry<Integer, Student> element : studentDetails.entrySet())
			{
				int empNo = element.getKey();
				if(empNo==sid)
				{
					Student student = element.getValue();
					fee = Double.valueOf((student.fee - (1000* student.merit)));
				}
			}
			return fee;
		}
	}



