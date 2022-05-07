package Programs;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BinarySearchTest {
	int[] a = {10,22,35,47,59};
	
	@Test
	public void bSearchTest() {
		assertEquals(2, BinarySearch.bSearch(a,5,35));
	}
	
	@Test
	public void bSearchTest2() {
		assertEquals(-1, BinarySearch.bSearch(a,5,65));
	}
	
	@Test
	public void bSearchTest3() {
		assertEquals(4, BinarySearch.bSearch(a,5,59));
	}
}
