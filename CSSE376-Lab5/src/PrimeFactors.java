import java.util.ArrayList;

/**
 * TODO Put here a description of what this class does.
 * 
 * @author Tan. Created Mar 26, 2011.
 */
public class PrimeFactors {

	public static ArrayList<Integer> findThem(int n) {
		ArrayList<Integer> ans = new ArrayList<Integer>();

		for (int i = 2; n > 1; i++)
			while (n % i == 0){
				ans.add(i);
				n /= i;
			}
		
		if (n > 1)
			ans.add(n);

		return ans;

	}

}
