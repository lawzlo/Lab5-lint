import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;



/**
 * Test exercise for Lab5
 *
 * @author Tan.
 *         Created Mar 26, 2011.
 */
public class PrimeFactorsTest {
	@Test
	public void testJUnit(){
		assertTrue("Test if JUnit works well!", true);
	}
	
	public void testEmpty(){
		assertEquals(list(), PrimeFactors.findThem(1));
	}
	
	public ArrayList<Integer> list(int... ints){
		
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i : ints){
			ret.add(i);
		}
		
		return ret;
	}


}
