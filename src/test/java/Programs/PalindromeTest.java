package Programs;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PalindromeTest {

	@Test
	public void palDromeTest() {
		assertEquals(true, Palindrome.paldrome("RADAR"));
	}
	
	@Test
	public void palDromeTest2() {
		assertEquals(false, Palindrome.paldrome("DYNAMO"));
	}
	
	@Test
	public void palDromeTest3() {
		assertEquals(true, Palindrome.paldrome("madam"));
	}
}
