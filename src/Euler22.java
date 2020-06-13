
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;


public class Euler22 {
    public static long valueOfName(String s) {
        char[] ABC = {'1', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
                    'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
                    'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] tempName = s.toCharArray();
        int sum = 0;
        for (char c : tempName) {
            for (int j = 0; j < ABC.length; j++) {
                if (c == ABC[j])
                    sum += j;
            }
        }
        return sum;
    }
    public static void main(String args[])throws Exception{
        String text = new String(Files.readAllBytes(Paths.get("p022_names.txt")));
        text = text.replaceAll("[^a-zA-Z-,]", "");
        String [] list = text.split(",");
        Arrays.sort(list);
        System.out.println(list.length);
        System.out.println(list[0]);
        long sum = 0;

        for (int i = 0; i < list.length; i++){
            long score = 0;
            score = valueOfName(list[i]) * (i+1);
            sum += score;
        }
        System.out.println(sum);
    }
}
