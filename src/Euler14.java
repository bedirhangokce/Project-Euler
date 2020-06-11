/*
Which starting number, under one million, produces the longest chain?
"Longest Collatz sequence"
 */

public class Euler14 {
    static long number(int x){
        long answer = 0;
        long temp,max = 0;
        long a = 0;
        for (int i = 1; i < x; i++){
            temp = i;
            while (temp != 1){
                if (temp % 2 == 1){
                    temp = (temp * 3) + 1;
                    a++;
                }
                if (temp % 2 == 0){
                    temp /= 2;
                    a++;
                }
            }
                if (a > max){
                    max = a;
                    answer = i;
                }
            a = 0;
        }
        return answer;
    }
    public static void main(String []args){
        long start = System.currentTimeMillis();
        System.out.println(number(1000000));
        long finish = System.currentTimeMillis();
        System.out.println("Time taken: " + (finish - start) + " milliseconds");
    }
}