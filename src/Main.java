/**
 * Created by jvdberg on 17/07/2014.
 */
public class Main {
    public static void main(String[] args) {
        int targetNthPrimeNumber = 10001;
        PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker(targetNthPrimeNumber);
        System.out.println("The " + targetNthPrimeNumber + "th prime number is: " + primeNumberChecker.getHighestPrimeNumber());
    }

}
