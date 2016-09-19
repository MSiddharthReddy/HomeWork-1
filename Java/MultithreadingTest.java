package queue;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultithreadingTest {

	@Test
	public void test1() {
		
		Boolean actualOutput = Multithreading.multiples("5", "2", "3");
		assertEquals(false, actualOutput);
	}
	@Test
	public void test2() {
		
		Boolean actualOutput = Multithreading.multiples("5", "a", "3");
		assertEquals(true, actualOutput);
	}
	


}
