/*
Find the difference between the sum of the
squares of the first one hundred natural
numbers and the square of the sum.
 */
public class Euler6 {
    static int sumSquareDiff(int x){
        int sumOfSquare = 0,squareOfSum = 0;
        for (int i = 1; i <= x ; i++){
            sumOfSquare += i*i;
            squareOfSum += i;
        }
        squareOfSum *= squareOfSum;
        return squareOfSum - sumOfSquare;
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(sumSquareDiff(100));
        long finish = System.currentTimeMillis();
        System.out.println("Time taken: " + (finish - start) + " milliseconds");
    }
}