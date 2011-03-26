import java.util.ArrayList;

/**
 * Lab5 Task5
 * 
 * @author Tan. Created Mar 26, 2011.
 */
public class Primes {
	
	public static ArrayList<Integer> find(int n) {
		ArrayList<Integer> ans = new ArrayList<Integer>();

		if (n > 3) {
			if (n % 2 == 0)
				ans.add(2);
			if (n % 3 == 0)
				ans.add(3);	
			
		} else if (n > 1)
			ans.add(n);
	
			
		return ans;

	}
	
}
