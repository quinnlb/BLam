import org.junit.Test;
import static org.junit.Assert.*;

	public class PrimeNumberMethodTest {
	    
	   @Test
	    public void testIsPrime() {
	        assertTrue(PrimeNumberMethod.isPrime(2));
	        assertTrue(PrimeNumberMethod.isPrime(3));
	        assertTrue(PrimeNumberMethod.isPrime(5));
	        assertTrue(PrimeNumberMethod.isPrime(1));
	        assertTrue(PrimeNumberMethod.isPrime(13));
	        assertTrue(PrimeNumberMethod.isPrime(11));
	        assertFalse(PrimeNumberMethod.isPrime(10));
	        assertFalse(PrimeNumberMethod.isPrime(6));
	        assertFalse(PrimeNumberMethod.isPrime(8));
	        assertFalse(PrimeNumberMethod.isPrime(9));
	        assertFalse(PrimeNumberMethod.isPrime(4));
	    }
	}