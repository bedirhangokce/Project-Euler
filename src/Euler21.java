public class Euler21 {
    static int sumOfDivisors(int x){
        int sumOfDivisors = 0;
     for (int i = 1; i < x; i++){
         if (x % i == 0) sumOfDivisors += i;
     }
     return sumOfDivisors;
    }
    static int sumOfAmicableNumbers(int x){
        int answer = 0;
        for (int i = 1; i <= x; i++){
            int number1 = sumOfDivisors(i);
            int number2 = sumOfDivisors(sumOfDivisors(i));
            if (number2 == i && i < number1) answer += (i+sumOfDivisors(i));
        }
        return answer;
    }
    public static void main(String[] args) {

        System.out.println(sumOfAmicableNumbers(10000));
    }
}
