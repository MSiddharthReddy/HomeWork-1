package queue;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterfaceTest {

	@Test
	public void test1() {
		int radius = 2;
		Double actualOutput = Interface.calCircle(radius);
		Double expectedOutput = 12.566370614359172;
		assertEquals(expectedOutput, actualOutput);
	}



	@Test
	public void test2() {
		int length = 10,breadth=2;
		Double actualOutput = Interface.calRectangle(length, breadth);
		Double expectedOutput = 20.0;
	}
}