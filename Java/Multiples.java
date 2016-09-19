package queue;

public class Multiples extends Thread{
	private int number;
	private int no;
	private Print print;
	int start;

	Multiples(Print print,int number,int no)
	{
		this.print = print;
		this.number = number;
		
		this.no = no;
	}

	public void run()
	{
		start = 1;
		while(start<=number)
		{
			
				print.print(start * no);
			
			start =start + 1;
		}	
	}
}