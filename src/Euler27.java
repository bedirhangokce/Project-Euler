public class Euler27 {
    private static boolean isPrime(int n){
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
            if (n % i == 0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int answerA = 0, answerB = 0, primeCount = 0;
        for (int a = -999; a < 1000; a++){
            for (int b = -1000; b <= 1000; b++){
                int n = 0;
                while (isPrime((n*n) + (a*n) + b)){
                    n++;
                }
                 if (n > primeCount){
                     primeCount = n;
                     answerA = a;
                     answerB = b;
                }
            }
        }
        System.out.println(primeCount+" "+answerA +" "+ answerB);
        System.out.println(answerA*answerB);
    }
}
