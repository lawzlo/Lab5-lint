import java.util.ArrayList;

/**
 * Lab5 Task5
 * 
 * @author Tan. Created Mar 26, 2011.
 */
public class Primes {

	public static ArrayList<Integer> find(int n) {

		ArrayList<Integer> ans = new ArrayList<Integer>();

		if (n > 1) {

			for (int i = 2; i <= n; i++)
				ans.add(i);
		}

		return ans;

	}

}
