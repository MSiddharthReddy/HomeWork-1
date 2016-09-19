package queue;

import static org.junit.Assert.*;

import org.junit.Test;

public class GenericsTest {

	@Test
	public void test1() {
		Integer [] array = {1, 2, 1};
		Boolean res = Generics.palindrome(array);
		assertEquals(true,res);
	}
	
	@Test
	public void test2() {
		Integer [] array = {0,3,4, 1};
		Boolean res = Generics.palindrome(array);
		assertEquals(false,res);
	}
	@Test
	public void test3() {
		Integer [] array = {1, 2,3, 1};
		Boolean res = Generics.palindrome(array);
		assertEquals(false,res);
	}
	@Test
	public void test4() {
		String [] array = {"a","b","b","a"};
		Boolean res = Generics.palindrome(array);
		assertEquals(true,res);
	}
	@Test
	public void test5() {
		String [] array = {"a","b","x","a"};
		Boolean res = Generics.palindrome(array);
		assertEquals(false,res);
	}
	

	

}
