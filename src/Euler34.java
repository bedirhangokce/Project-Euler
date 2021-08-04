public class Euler34 {
    public static void main(String[] args) {
        int answer = 0;
        for (int i = 3; i< 1000000; i++){
            int number = i;
            int sumOfFactorials = 0;
            while(number> 0){
                sumOfFactorials += fact(number % 10);
                number = number / 10;

            }
            if (sumOfFactorials == i){
                answer += sumOfFactorials;
                System.out.println(sumOfFactorials);
            }

        }
        System.out.println(answer);
    }
    static int fact(int i){
        if (i == 1 || i == 0) return 1;
        return i * fact(i-1);
    }
}
