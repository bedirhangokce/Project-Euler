public class Euler30 {
    private static boolean isDigitFifthPowers(int x){
            int sum = 0;
            int temp = x;
            while (temp != 0){
                sum += Math.pow(temp % 10,5);
                temp = temp / 10;
            }
        return x==sum;
    }
    private static int sumOfDigitFifthPowers(){
        int answer = 0;
        for (int i = 10; i < 1000000; i++){
            if (isDigitFifthPowers(i))
                answer += i;
        }
        return answer;
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis(); // start the stopwatch
        System.out.println(sumOfDigitFifthPowers());
        long finish = System.currentTimeMillis(); // stop the stopwatch
        System.out.println("Time taken: " + (finish - start) + " milliseconds");
    }
}
