package in.gov.isro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testcals {

	@Test
	public void testAdd() {
		
		Calculator calc= new Calculator();
		int result = calc.add(5,5);
		assertEquals(10,result);
	}
	
	@Test
    public void testMultiply() {
		
		Calculator calc= new Calculator();
		int result = calc.multiply(5,5);
		assertEquals(25,result);
	}

	
	@Test
	public void testSubtract()
	{
		Calculator calc= new Calculator();
		int result = calc.subtract(10,5);
		assertEquals(5, result);
	}

}
