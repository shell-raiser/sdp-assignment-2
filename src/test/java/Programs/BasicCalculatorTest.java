package Programs;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BasicCalculatorTest {
	
	@Test
	public void addTest() {
		assertEquals(5,BasicCalculator.add(2, 3));
	}
	
	@Test
	public void subTest() {
		assertEquals(4,BasicCalculator.sub(7, 3));
	}
	
	@Test
	public void mulTest() {
		assertEquals(15,BasicCalculator.mul(5, 3));
	}
	
	@Test
	public void divTest() {
		assertEquals(6,BasicCalculator.div(36, 6));
	}
}
