package queue;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayTest {

	
	@Test
	public void test2() {		
		String result = Array.reverse("abc");		
		assertEquals("cba", result);
	}
	
	@Test
	public void test3() {		
		String result = Array.reverse("as");		
		assertEquals("sa", result);
	}
	
	@Test
	public void test4() {		
		String result = Array.reverse("aaass");		
		assertEquals("ssaaa", result);
	}@Test
	public void test5() {		
		String result = Array.reverse("qwer");		
		assertEquals("rewq", result);
	}

}
