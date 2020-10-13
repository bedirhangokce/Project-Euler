/*
What is the 10001'st prime number?
Time taken: 563 milliseconds
 */
public class Euler07 {
    static int primeNum(int x){
        int temp = 0;
        for (int i  = 2; i < 2000000; i++){
            if (isPrime(i)) temp++;
            if (temp == x) return i;
        }

        return 0;
    }
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < (n / 2) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis(); // start the stopwatch
        System.out.println(primeNum(10001));
        long finish = System.currentTimeMillis(); // stop the stopwatch
        System.out.println("Time taken: " + (finish - start) + " milliseconds");
    }
}
