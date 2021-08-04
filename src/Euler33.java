import java.util.ArrayList;
import java.util.List;

public class Euler33 {
    public static void main(String[] args) {
        for(double i = 10; i < 100; i++){
            for (double j = i+1; j < 100; j++){
                if ((((int) (j / 10)) == (i % 10)) &&(j % 10 != 0) && (i / j == ((int) (i / 10)) / (j % 10))){

                    System.out.println("i= " + i + " j= " + j);
                }
            }
        }
    }

}
