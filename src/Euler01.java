/*
Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Euler01 {
    private static int sum_of_div_35(int x){
        int sum = 0;
        for (int i = 0; i < x; i++){
            if (i % 3 == 0 || i % 5 == 0) sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis(); // start the stopwatch
        System.out.println(sum_of_div_35(1000));
        long finish = System.currentTimeMillis(); // stop the stopwatch
        System.out.println("Time taken: " + (finish - start) + " milliseconds");
    }
}