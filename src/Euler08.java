/*
Find the thirteen adjacent digits in the 1000-digit number
that have the greatest product. What is the value of this product?
 */
public class Euler08 {
    static Long largestProduct(String num){

        long n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13;
        long sum=0, newSum;
        for(int n=0; n<= 950; n++){
            n1=Character.getNumericValue(num.charAt(n));
            n2=Character.getNumericValue(num.charAt(n+1));
            n3=Character.getNumericValue(num.charAt(n+2));
            n4=Character.getNumericValue(num.charAt(n+3));
            n5=Character.getNumericValue(num.charAt(n+4));
            n6=Character.getNumericValue(num.charAt(n+5));
            n7=Character.getNumericValue(num.charAt(n+6));
            n8=Character.getNumericValue(num.charAt(n+7));
            n9=Character.getNumericValue(num.charAt(n+8));
            n10=Character.getNumericValue(num.charAt(n+9));
            n11=Character.getNumericValue(num.charAt(n+10));
            n12=Character.getNumericValue(num.charAt(n+11));
            n13=Character.getNumericValue(num.charAt(n+12));
            newSum = (n1*n2*n3*n4*n5*n6*n7*n8*n9*n10*n11*n12*n13);
            if(newSum>=sum)
                sum=newSum;
        }
        return sum;
    }



    public static void main(String[] args) {
        long start = System.currentTimeMillis(); // start the stopwatch
        System.out.println(largestProduct(text));
        long finish = System.currentTimeMillis(); // stop the stopwatch
        System.out.println("Time taken: " + (finish - start) + " milliseconds");
    }
    static String text = "73167176531330624919225119674426574742355349194934"+
            "96983520312774506326239578318016984801869478851843"+
            "85861560789112949495459501737958331952853208805511"+
            "12540698747158523863050715693290963295227443043557"+
            "66896648950445244523161731856403098711121722383113"+
            "62229893423380308135336276614282806444486645238749"+
            "30358907296290491560440772390713810515859307960866"+
            "70172427121883998797908792274921901699720888093776"+
            "65727333001053367881220235421809751254540594752243"+
            "52584907711670556013604839586446706324415722155397"+
            "53697817977846174064955149290862569321978468622482"+
            "83972241375657056057490261407972968652414535100474"+
            "82166370484403199890008895243450658541227588666881"+
            "16427171479924442928230863465674813919123162824586"+
            "17866458359124566529476545682848912883142607690042"+
            "24219022671055626321111109370544217506941658960408"+
            "07198403850962455444362981230987879927244284909188"+
            "84580156166097919133875499200524063689912560717606"+
            "05886116467109405077541002256983155200055935729725"+
            "71636269561882670428252483600823257530420752963450";
}
