/*
What is the largest prime factor of the number 600851475143 ?
Time taken: 1 milliseconds
 */
public class Euler03 {
    static long num = 600851475143L;
    static long fac = 1;
    static boolean primeCheck(long x){
        for (int div = 2; div <= Math.sqrt(x); div ++){
            if (x % div == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        while (num > 1) {
            fac++;
            if (primeCheck(fac)){
                while (num % fac == 0){
                    num /= fac;
                }
            }
        }
        System.out.println(fac);
        long finish = System.currentTimeMillis();
        System.out.println("Time taken: " + (finish - start) + " milliseconds");
    }
}
