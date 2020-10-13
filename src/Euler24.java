public class Euler24 {
    static boolean isArmstrongNumber(int numberToCheck) {
        double sum = 0;
        if (numberToCheck == 0) return true;
        String length = Integer.toString(numberToCheck);
        char [] x = length.toCharArray();
        int numberLength = length.length();

        for (int i = 0; i < numberLength; i++) {

            sum += Math.pow(Character.getNumericValue(x[i]), numberLength);

        }


        return numberToCheck == sum;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
    }
}

