package queue;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueTest {

	@Test
	public void test1() {
		Boolean result = Queues.checkEquals("Siddharth", "iddharth");		
		assertEquals(false, result);
	}
	@Test
	public void test2() {		
		Boolean result = Queues.checkEquals("a", "b");		
		assertEquals(false, result);
	}
	
	@Test
	public void test3() {		
		Boolean result = Queues.checkEquals("xyz", "zyx");		
		assertEquals(false, result);
	}
	
	@Test
	public void test4() {		
		Boolean result = Queues.checkEquals("india", "india");		
		assertEquals(true, result);
	}@Test
	public void test5() {		
		Boolean result = Queues.checkEquals("example", "exmple");		
		assertEquals(false, result);
	}

}
