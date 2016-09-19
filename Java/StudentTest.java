package queue;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	@Test
	public void testAdd1() {
		Boolean actualResult = Collection.addStudent("Siddharth", "1", "12000", "10");
		assertEquals(true,actualResult);
	}

	@Test
	public void testAdd2() {
		Boolean actualResult = Collection.addStudent("Nischith", "1212", "120000", "5.0");
		assertEquals(false,actualResult);
	}

	@Test
	public void testAdd3() {
		Boolean actualResult = Collection.addStudent("Jay", "9", "Saas", "9");
		assertEquals(false,actualResult);
	}

	@Test
	public void testCalculate1() {
		Double exFee = -1.0;
		Double actualFee = Collection.calculateFeeDiscount(10);
		assertEquals(exFee,actualFee);
	}

	@Test
	public void testCalculate2() {
		Boolean add = Collection.addStudent("Student1", "1", "120000", "5");
		Double exFee = -1.0;
		Double actualFee = Collection.calculateFeeDiscount(8);
		assertEquals(exFee,actualFee);
	}

	

}
