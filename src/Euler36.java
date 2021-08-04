public class Euler36 {
    public static void main(String[] args) {
        int answer = 0;
        for(int i = 0; i < 1000000; i++){
            if (isPalindrome(i) && isPalindrome(Integer.toBinaryString(i))){
                answer += i;
            }
        }
        System.out.println(answer);
    }
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
    static Boolean isPalindrome(String x){
        String s= "";
        for (int i = x.length() -1; i >= 0; i--){
            s += x.charAt(i);
        }
        return s.equals(x);
    }
}
