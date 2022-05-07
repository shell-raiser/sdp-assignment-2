package Programs;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LinearSearchTest {
	int[] a = {18,30,12,6,75,90};
	
	@Test
	public void searchTest() {
		assertEquals(1, LinearSearch.search(a,6,30));
	}
	
	@Test
	public void searchTest2() {
		assertEquals(-1, LinearSearch.search(a,6,100));
	}
	
	@Test
	public void searchTest3() {
		assertEquals(4, LinearSearch.search(a,6,75));
	}
}
