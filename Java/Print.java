package queue;

public class Print {

	
	synchronized void print(int number){
		
		System.out.println(number);
		
		notifyAll();
	}
}
