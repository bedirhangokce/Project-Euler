public class Euler12 {
    private static long divNumberOfTriangleNumber(long x){
        long answer=0;
        long temp = 0;
        while(true){
            temp++;
            answer += temp;
            if (findCountOfDivisors(answer) >= x) break;
        }
        return answer;
    }
    private static long findCountOfDivisors(long no) {
        long result = 0;
        long end = (long)Math.sqrt(no);
        for (long i = 1; i*i <= no; i++) {
            if (no % i == 0) {
                result += 1;
            }
        }
        for (long j = 1; j <= Math.sqrt(no); j++){
            if (no % j == 0) {
                result += 1;
            }
        }
        if (no % end == 0){
            result-=1;
        }

        return result;
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(divNumberOfTriangleNumber(500));
        long finish = System.currentTimeMillis();
        System.out.println("Time taken: " + (finish - start) + " milliseconds");
    }
}