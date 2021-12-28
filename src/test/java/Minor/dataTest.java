package Minor;

import static org.junit.Assert.*;

import org.junit.Test;



public class dataTest {

	@Test
	public void test() {
		data ob = new data();
		assertEquals(8, ob.sum(5, 3));
		assertEquals(2, ob.diff(5, 3));
		assertEquals(15, ob.pro(5, 3));
		assertEquals(2, ob.divide(5, 3));
	}

}
