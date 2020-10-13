// I found a pattern here. I don't know this is the right way
// for programming but I cannot find another way.(except represent all the matrix)
// 4*n^2 - 6*n + 6 (n is the lenght of
public class Euler28 {
    private static int numberSpiralDiagonals(int x){
        int answer = 1;
        for (int i = 3; i <= x; i+=2){
            answer += 4*(i*i) - (6*i) + 6;
        }

        return answer;
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis(); // start the stopwatch
        System.out.println(numberSpiralDiagonals(1001));
        long finish = System.currentTimeMillis(); // stop the stopwatch
        System.out.println("Time taken: " + (finish - start) + " milliseconds");
    }
}
