public class Euler39 {
    public static void main(String[] args) {
        int answer = 0;
        int value = 0;
        for (int i = 1; i <= 1000; i++){
            int count = 0;
            for (int j = 1; j < i-1; j++){
                for(int k = 1; k < i-1; k++){
                    double pow = Math.pow(i - (j + k), 2);
                    if(Math.pow(j,2) + Math.pow(k,2) == pow
                        && j + k + Math.sqrt(pow) == i){
                        count++;
                    }
                }
            }
            if(count > answer){
                answer = count;
                value = i;
            }
        }
        System.out.println(value);
    }
}
