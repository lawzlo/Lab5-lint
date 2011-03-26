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
	
	@Test
	public void testOne(){
		assertEquals(list(), PrimeFactors.findThem(1));
	}
	
	@Test
	public void testTwo(){
		assertEquals(list(2), PrimeFactors.findThem(2));
		
	}
	
	@Test
	public void testThree(){
		assertEquals(list(3), PrimeFactors.findThem(3));
		
	}
	
	@Test
	public void testFour(){
		assertEquals(list(2, 2), PrimeFactors.findThem(4));
		
	}
	public ArrayList<Integer> list(int... ints){
		
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i : ints){
			ret.add(i);
		}
		
		return ret;
	}


}
