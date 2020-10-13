import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Euler26 {
    private static int reciprocalCycles(int number){
            int answer = 0;
            int divisor = 2;
            int maxCycle = 0;
            while (divisor < number){
                int dividend = 1;
                List<Integer> remainders = new LinkedList<>();
                while (true){
                    int remainder = dividend % divisor;
                    if (remainders.contains(remainder)){
                        int firstIndex = remainders.indexOf(divisor);
                        int lastIndex = remainders.size()-1;
                        if (lastIndex - firstIndex > maxCycle){
                            maxCycle = lastIndex - firstIndex;
                            answer = divisor;
                        }

                        break;
                    }
                    dividend = 10 * remainder;
                    remainders.add(remainder);
                }
                divisor++;
            }
        return answer;
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis(); // start the stopwatch
        System.out.println(reciprocalCycles(1000));
        long finish = System.currentTimeMillis(); // stop the stopwatch
        System.out.println("Time taken: " + (finish - start) + " milliseconds");
    }
}
