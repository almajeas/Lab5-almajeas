import java.util.ArrayList;

/**
 * TODO Put here a description of what this class does.
 * 
 * @author trederdj. Created Mar 22, 2012.
 */
public class PrimeFactorization {

	public static ArrayList<Integer> primeFactorization(int i) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for (int c = 2; i > 1; c++) {
			for(; i % c == 0; i /= c) {
				factors.add(c);
			}
		}
		return factors;
	}

	public static ArrayList<Integer> primeGenerator(int i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		for (int n = 2; n < i; n++) {
			if (primeFactorization(n).size() == 1) {
				primes.add(n);
			}
		}
		return primes;
	}

}
