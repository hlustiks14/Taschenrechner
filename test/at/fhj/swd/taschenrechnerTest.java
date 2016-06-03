package at.fhj.swd;

import static org.junit.Assert.*;

import org.junit.Test;

public class taschenrechnerTest {

	@Test
	public void testAdd() {
		assertEquals(17, taschenrechner.add(15,2));
	}

}
