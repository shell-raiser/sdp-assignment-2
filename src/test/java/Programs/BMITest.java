package Programs;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BMITest {
	
	@Test
	public void bmiCalcTest() {
		assertEquals(20,BMI.bmiCalc(67, 180));
	}
	
	@Test
	public void bmiCalcTest1() {
		assertEquals(20,BMI.bmiCalc(56, 165));
	}
	
	@Test
	public void bmiCalcTest2() {
		assertEquals(14,BMI.bmiCalc(52, 190));
	}
}
