/*
What is the largest prime factor of the number 600851475143 ?
 */
public class Euler3 {
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
        while (num > 1) {
            fac++;
            if (primeCheck(fac) == true){
                while (num % fac == 0){
                    num /= fac;
                }
            }
        }
        System.out.println(fac);
    }
}
