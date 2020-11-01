import java.util.Arrays;
//Time taken: 711 milliseconds
public class Euler32 {
    private static boolean isPandigital(String text){
        if (text.length() != 9) return false;
        char[] temp = text.toCharArray();
        Arrays.sort(temp);
        return new String(temp).equals("123456789");
    }
    private static int pandigitalProducts(){
        int answer = 0;
        for (int i = 0; i < 20000; i++){
            if (hasPandigitalProduct(i))
                answer += i;
        }


        return answer;
    }
    private static boolean hasPandigitalProduct(int n){
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && isPandigital("" + n + i + n/i))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis(); // start the stopwatch
        System.out.println(pandigitalProducts());
        long finish = System.currentTimeMillis(); // stop the stopwatch
        System.out.println("Time taken: " + (finish - start) + " milliseconds");

    }
}
