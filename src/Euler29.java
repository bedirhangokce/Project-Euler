import java.util.ArrayList;
import java.util.List;

public class Euler29 {
    private static long distinctPowers(int x){
        List<Double> list = new ArrayList<>();
        for (int i = 2; i <= x ; i++){
            for (int j = 2; j <= x ; j++){
                list.add(Math.pow(i,j));
            }
        }
        return list.stream().distinct().count();
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis(); // start the stopwatch
        System.out.println(distinctPowers(100));
        long finish = System.currentTimeMillis(); // stop the stopwatch
        System.out.println("Time taken: " + (finish - start) + " milliseconds");
    }
}
