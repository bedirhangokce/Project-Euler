public class Euler40 {
    public static void main(String[] args) {
        StringBuilder number = new StringBuilder();
        for (int i = 1; i < 1000000; i++){
            number.append(i);
        }
        long answer = 1;
        System.out.println(answer);
        answer *= Integer.parseInt(number.substring(0,1));

        answer *= Integer.parseInt(number.substring(9,10));
        answer *= Integer.parseInt(number.substring(99,100));
        answer *= Integer.parseInt(number.substring(999,1000));
        answer *= Integer.parseInt(number.substring(9999,10000));
        answer *= Integer.parseInt(number.substring(99999,100000));
        answer *= Integer.parseInt(number.substring(999999,1000000));

        System.out.println(answer);
    }
}
