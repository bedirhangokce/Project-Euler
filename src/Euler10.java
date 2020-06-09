/*
Find the sum of all the primes below two million.
 */
public class Euler10 {

    static long sumOfPrimes(int value){
        long sum = 0;
        for (int i = 2; i < value; i++){
            if (isPrime(i)){
                sum += i;
            }
        }
        return sum;
    }
    private static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < (n/2)+1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis(); // start the stopwatch
        System.out.println(sumOfPrimes(2000000));
        long finish = System.currentTimeMillis(); // stop the stopwatch
        System.out.println("Time taken: " + (finish - start) + " milliseconds");

    }
}
