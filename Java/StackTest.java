package queue;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void test1() {
		Boolean result = Stacks.checkPalindrome("Siddharth");		
		assertEquals(false, result);
	}
	@Test
	public void test2() {		
		Boolean result = Stacks.checkPalindrome("dasdllasnxla");			
		assertEquals(false, result);
	}
	
	@Test
	public void test3() {		
		Boolean result = Stacks.checkPalindrome("asaswws");			
		assertEquals(false, result);
	}
	
	@Test
	public void test4() {		
		Boolean result = Stacks.checkPalindrome("saas");		
		assertEquals(true, result);
	}@Test
	public void test5() {		
		Boolean result = Stacks.checkPalindrome("sid");			
		assertEquals(false, result);
	}

}
