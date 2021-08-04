public class Euler37 {
    public static void main(String[] args) {
        int count = 0;
        int i = 10;
        int sum = 0;
        while(true){
            if (count == 11) break;
            if (isTruncatable(i)) {
                count++;
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
    static boolean isTruncatable(int number){
        int x = number;
        while(x != 0){
            if (!isPrime(x)) return false;
            x /= 10;
        }
        x = number;
        while (x > 10){
            x = Integer.parseInt(String.valueOf(x).substring(1));
            if (!isPrime(x)) return false;
        }
        return true;
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
