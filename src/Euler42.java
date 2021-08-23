import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Euler42 {
    public static void main(String[] args) throws IOException {
        List<Integer> triangleNumbers = new ArrayList<Integer>();
        for (int i = 1; i < 50; i++){
            int number = i * (i+1) / 2;
            triangleNumbers.add(number);
        }
        System.out.println(triangleNumbers);
        String text = new String(Files.readAllBytes(Paths.get("p042_words.txt")));
        text = text.replaceAll("[^a-zA-Z-,]", "");
        String [] list = text.split(",");
        Arrays.sort(list);
        int answer = 0;
        for (String x: list) {
            char[] array = x.toCharArray();
            int toplam = 0;
            for (char a: array) {
                toplam += ((int)a - 64);
            }
            if (triangleNumbers.contains(toplam)){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
