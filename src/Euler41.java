import java.util.Arrays;

public class Euler41 {
    private static boolean isPandigital(String text){
        String check = "";
        for (int i = 1; i <= text.length(); i++){
            check += i;
        }
        char[] temp = text.toCharArray();
        Arrays.sort(temp);
        return new String(temp).equals(check);
    }
    private static boolean isPrime(long x){
        if (x == 1 || x < 1) return false;
        for (int i= 3; i < Math.sqrt(x)+1;i++){
            if (x % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        long answer = 0;
        for (long i = 1000000; i < 10000000; i++){
            if(i % 2 == 1){
                if (isPandigital(String.valueOf(i))){
                    if (isPrime(i)){
                        if (answer < i) answer = i;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}