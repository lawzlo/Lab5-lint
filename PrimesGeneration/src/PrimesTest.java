import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;



/**
 * Lab5 Task5
 *
 * @author Tan.
 *         Created Mar 26, 2011.
 */
public class PrimesTest {
	@Test
	public void TestJUnit(){
		
		assertTrue("well", true);
	}
	
	@Test
	public void TestZeroAndOne(){
		
		assertEquals(list(), Primes.find(0));
		assertEquals(list(), Primes.find(1));
	}
	
	@Test
	public void TestTwoAndThree(){
		
		assertEquals(list(2), Primes.find(2));
		assertEquals(list(2, 3), Primes.find(3));
	}
	

	
	
	public ArrayList<Integer> list(int... ints) {

		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i : ints) {
			ret.add(i);
		}

		return ret;
	}

}
