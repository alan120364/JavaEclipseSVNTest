package adderTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import adder.Adder;

// TODO: Auto-generated Javadoc
/**
 * The Class AdderTest.
 */
public class AdderTest {

	/** The adder. */
	private Adder adder;
	
	/**
	 * Sets up before class.
	 */
	@BeforeClass
	public void setUpBeforeClass(){
		adder = new Adder();
	}
	
	/**
	 * Test add2integer().
	 */
	@Test
	public void testadd2Integer() {
		int result = adder.add2Integer(1, 2);
		assertTrue(result == 3);
	}
}
