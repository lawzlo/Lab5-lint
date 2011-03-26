import java.util.ArrayList;

/**
 * Find prime factors.
 * 
 * @author Tan. Created Mar 26, 2011.
 */
public class PrimeFactors {

	public static ArrayList<Integer> findThem(int n) {
		ArrayList<Integer> ans = new ArrayList<Integer>();

		for (int i = 2; n > 1; i++)
			for (; n % i == 0; n /= i)
				ans.add(i);
		
		return ans;

	}

}
