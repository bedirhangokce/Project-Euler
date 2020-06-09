/*
Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Euler4 {
    static Boolean isPalindrome(int x){
        int num=x;
        int reversenum =0;
        while( num != 0 )
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num/10;
        }
        return reversenum == x;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis(); // start the stopwatch
        int answer = 0;
        for (int i = 100; i < 999; i++){
            for (int j = 100; j < 999; j++){
                if (isPalindrome(i*j)){
                    if (answer < i*j){
                        answer = i*j;
                    }

                }
            }
        }
        System.out.println(answer);
        long finish = System.currentTimeMillis(); // stop the stopwatch
        System.out.println("Time taken: " + (finish - start) + " milliseconds");
    }
}
