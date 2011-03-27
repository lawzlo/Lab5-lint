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

			for (int i = 2; i <= n; i++) {
				boolean flag = true;
				for (int j = 2; j <= Math.sqrt(i); j++)
					if (i % j == 0) {
						flag = false;
						break;
					}

				if (flag)
					ans.add(i);

			}

		}

		return ans;

	}

}
