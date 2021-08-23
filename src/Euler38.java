import java.util.Arrays;

public class Euler38 {
    private static boolean isPandigital(String text){
        if (text.length() != 9) return false;
        char[] temp = text.toCharArray();
        Arrays.sort(temp);
        return new String(temp).equals("123456789");
    }

    public static void main(String[] args) {
        int answer = 0;
        for (int i= 1; i< 10000; i++){
            for (int k = 2; k < 10; k++){
                String x = "";
                for (int j = 1; j < k; j++){
                    x += i*j;
                }
                if (isPandigital(x) ){
                    if(answer < Integer.parseInt(x)){
                        answer = Integer.parseInt(x);
                    }
                    System.out.println(i+" "+answer);
                }
            }
        }
    }
}
