/*
By considering the terms in the Fibonacci
sequence whose values do not exceed four million,
find the sum of the even-valued terms.
 */
public class Euler2 {
    private static int sum_of_even_fib(int x){
        int sum = 0, evensum = 0;
        int a = 0;
        int b = 1;
        while (b < x){
            sum = a + b;
            a = b;
            b = sum;
            if (sum % 2 == 0){
                evensum += sum;
            }
        }

        return evensum;
    }
    public static void main(String[] args) {

        long start = System.currentTimeMillis(); // start the stopwatch
        System.out.println(sum_of_even_fib(4000000));
        long finish = System.currentTimeMillis(); // stop the stopwatch
        System.out.println("Time taken: " + (finish - start) + " milliseconds");
    }
}
