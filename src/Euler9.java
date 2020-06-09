/*
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */
public class Euler9 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int a = 1; a < 1000; a++){
            for (int b = a; b < 1000; b++){
                double c = Math.sqrt((a*a)+(b*b));
                if (a + b + c == 1000){
                    long x = (long) (a*b*c);
                    System.out.println(x);

                }
            }
        }
        long finish = System.currentTimeMillis();
        System.out.println("Time taken: " + (finish - start) + " milliseconds");
    }
}
