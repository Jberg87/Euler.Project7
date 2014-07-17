import junit.framework.Assert;
import junit.framework.TestCase;

public class PrimeNumberCheckerTest extends TestCase {


    public void test_1_is_a_prime_number() {
        PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker();
        Assert.assertEquals(false, primeNumberChecker.isPrimeNumber(1));
    }


    public void test_13_is_a_prime_number() {
        PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker();
        Assert.assertEquals(true, primeNumberChecker.isPrimeNumber(13));
    }

    public void test_14_is_a_prime_number() {
        PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker();
        Assert.assertEquals(false, primeNumberChecker.isPrimeNumber(14));
    }


    public void test_nst_prime_number() {
        PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker(1);
        Assert.assertEquals(2, primeNumberChecker.getHighestPrimeNumber());
        primeNumberChecker = new PrimeNumberChecker(2);
        Assert.assertEquals(3, primeNumberChecker.getHighestPrimeNumber());
        primeNumberChecker = new PrimeNumberChecker(6);
        Assert.assertEquals(13, primeNumberChecker.getHighestPrimeNumber());
    }

}