import java.math.BigInteger;

public class Euler16 {
    public static void main(String[] args) {
        BigInteger big = new BigInteger(String.valueOf(BigInteger.valueOf(1)));
        for (int i = 0; i < 1000; i++) {
            big = big.multiply(BigInteger.valueOf(2));
        }
        String digits = big.toString();
        int sum = 0;

        for(int i = 0; i < digits.length(); i++) {
            int digit = digits.charAt(i) - '0';
            sum = sum + digit;
        }
        System.out.println(sum);
    }
}
