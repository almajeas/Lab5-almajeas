import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;


/**
 * TODO Put here a description of what this class does.
 *
 * @author trederdj.
 *         Created Mar 22, 2012.
 */
public class PrimeFactorizationTest {

	@Test
	public void test() {
		assertTrue("This statement is not a lie.", true);
	}
	
	@Test
	public void testOne(){
		assertEquals(new ArrayList<Integer>(), PrimeFactorization.primeFactorization(1));
	}
	
	@Test
	public void testTwo(){
		Integer[] ar = {2};
		assertEquals(list(ar), PrimeFactorization.primeFactorization(2));
	}
	
	@Test
	public void testThree(){
		Integer[] ar = {3};
		assertEquals(list(ar), PrimeFactorization.primeFactorization(3));
	}
	
	@Test
	public void testFour(){
		Integer[] ar = {2, 2};
		assertEquals(list(ar), PrimeFactorization.primeFactorization(4));
	}
	
	@Test
	public void testSix(){
		Integer[] ar = {2, 3};
		assertEquals(list(ar), PrimeFactorization.primeFactorization(6));
	}
	
	@Test 
	public void testEight(){
		Integer[] ar ={2 , 2 , 2};
		assertEquals(list(ar), PrimeFactorization.primeFactorization(8));
	}
	
	@Test
	public void testNine(){
		Integer[] ar = {3, 3};
		assertEquals(list(ar), PrimeFactorization.primeFactorization(9));
	}
	
	@Test
	public void testTen(){
		Integer [] ar = {2 , 5};
		assertEquals(list(ar), PrimeFactorization.primeFactorization(10));
	}
	
	@Test
	public void testTwelve(){
		Integer [] ar = { 2 , 2 ,3};
		assertEquals(list(ar), PrimeFactorization.primeFactorization(12));
	}
	@Test
	public void testBigNumber(){
		Integer [] ar = { 5 , 7, 7, 1327};
		assertEquals(list(ar), PrimeFactorization.primeFactorization(325115));
	}
	
	private ArrayList<Integer> list(Integer[] ar){
		return new ArrayList<Integer>(Arrays.asList(ar));
	}
	
	@Test
	public void testGetPrimesOne(){
		Integer [] ar = {};
		assertEquals(list(ar), PrimeFactorization.primeGenerator(1));
	}
	
	@Test
	public void testGetPrimesThree() {
		Integer [] ar = {2};
		assertEquals(list(ar), PrimeFactorization.primeGenerator(3));
	}
	
	@Test
	public void testGetPrimesFour(){
		Integer [] ar = {2 ,3};
		assertEquals(list(ar), PrimeFactorization.primeGenerator(4));
	}
	
	@Test
	public void testGetPrimesFive(){
		Integer [] ar = {2 ,3};
		assertEquals(list(ar), PrimeFactorization.primeGenerator(5));
	}
	
	@Test
	public void testGetPrimesSix(){
		Integer [] ar = {2 ,3, 5};
		assertEquals(list(ar), PrimeFactorization.primeGenerator(6));
	}
	
	@Test
	public void testGetPrimesBigNumber(){
		Integer [] ar = {2 ,3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
		assertEquals(list(ar), PrimeFactorization.primeGenerator(50));
	}
}
