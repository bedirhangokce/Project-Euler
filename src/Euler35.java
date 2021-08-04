public class Euler35 {
    public static void main(String[] args) {
        int answer = 0;
        for (int i = 2; i < 1000000; i++){
            if (isCircularPrime(i)) answer++;
        }
        System.out.println(answer);
    }
    static boolean isCircularPrime(int number){
        String s = String.valueOf(number);
        for (int i = 0; i < s.length(); i++){
            if (!isPrime(Integer.parseInt(s.substring(i) + s.substring(0,i)))){
                return false;
            }
        }


        return isPrime(number);

    }
    static boolean isPrime(int number){
        if (number == 1) return false;
        if(number == 2) return true;
        for (int i = 2; i < Math.sqrt(number) + 1; i++){
            if (number % i == 0) return false;
        }
        return true;
    }
}
