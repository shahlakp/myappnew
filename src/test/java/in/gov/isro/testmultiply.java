package in.gov.isro;

import static org.junit.Assert.*;

import org.junit.Test;

public class testmultiply {

	@Test
	public void test() {
		Calculator calc= new Calculator();
		int result = calc.multiply(5,5);
		assertEquals(25,result);
	}

}
