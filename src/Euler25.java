import java.math.BigInteger;

public class Euler25 {
    public static void main(String[] args) {
        BigInteger bigInteger1 = new BigInteger(String.valueOf(0));
        BigInteger bigInteger2 = new BigInteger(String.valueOf(1));
        BigInteger bigInteger3;
        int answer = 1;
        while (true){
            bigInteger3 = bigInteger1.add(bigInteger2);
            bigInteger1 = bigInteger2;
            bigInteger2 = bigInteger3;
            answer++;
            if (bigInteger2.toString().length() == 1000)break;
        }
        System.out.println(answer);
    }
}
