import java.util.ArrayList;

/**
 * Created by jvdberg on 17/07/2014.
 */
public class PrimeNumberChecker {
    ArrayList<Integer> primeNumberList = new ArrayList<Integer>();


    public PrimeNumberChecker() {
        primeNumberList.add(2); primeNumberList.add(3);
    }
    public PrimeNumberChecker(int targetNthPrimeNumber) {
        if (targetNthPrimeNumber == 1) primeNumberList.add(2);
        else {primeNumberList.add(2); primeNumberList.add(3);}
        checkForPrimeNumbers(targetNthPrimeNumber);
    }


    public void checkForPrimeNumbers(int targetNthPrimeNumber) {
        for (int numberToCheck = 1; primeNumberList.size() < targetNthPrimeNumber; numberToCheck++)
            if (isPrimeNumber(numberToCheck)) {
            }
    }

    public int getHighestPrimeNumber() {
        return primeNumberList.get(primeNumberList.size()-1);
    }

    public boolean isPrimeNumber(int numberToCheck) {
        if (numberToCheck == 1) return false;

        for (int primeNumber: primeNumberList) {
            if (numberToCheck % primeNumber == 0) {
                return false;
            }
        }
        primeNumberList.add(numberToCheck);
        return true;
    }
}
