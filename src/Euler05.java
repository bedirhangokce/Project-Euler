/*
What is the smallest positive number that is evenly
divisible by all of the numbers from 1 to 20?
 */
public class Euler05 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long x = 20;
        while (true){
            boolean check = true;
            for (int i = 1; i < 21; i++){
                check = true;
                if (x % i != 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(x);
                break;
            }
            x++;
        }
        long finish = System.currentTimeMillis();
        System.out.println("Time taken: " + (finish - start) + " milliseconds");
    }
}

