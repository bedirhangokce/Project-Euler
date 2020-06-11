import java.math.BigInteger;

public class Euler20 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int answer = 0;
        BigInteger big = new BigInteger(String.valueOf(BigInteger.valueOf(1)));
        for (int i = 100; i > 0; i--){
            big = big.multiply(BigInteger.valueOf(i));
        }

        String x = big.toString();
        String[] y = x.split("");
        for (String a:y
             ) {
            int n = Integer.parseInt(a);
            answer += n;
        }

        System.out.println(answer);
        long finish = System.currentTimeMillis();
        System.out.println("Time taken: " + (finish - start) + " milliseconds");

    }
}
