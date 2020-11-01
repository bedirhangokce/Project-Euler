public class Euler31 {
    private static int differentWays(int x){
        int answer = 0;
        for (int a = 0; a < 2; a++){
            int sum = 0;
            sum += a*200;
            if (sum >= 200) {
                if (sum == 200) answer++;
                    break;
            }
            for (int b = 0; b < 3; b++){
                sum = a*200 + b*100;
                if (sum >= 200) {
                    if (sum == 200) answer++;
                    break;
                }
                for (int c = 0; c < 5; c++){
                    sum = a*200 + b*100;
                    if (sum >= 200) {
                        if (sum == 200) answer++;
                        break;
                    }
                    for (int d = 0; d <= 10; d++){
                        sum = a*200;
                        if (sum >= 200) {
                            if (sum == 200) answer++;
                            break;
                        }
                        for (int e = 0; e <= 20; e++){
                            sum = a*200;
                            if (sum >= 200) {
                                if (sum == 200) answer++;
                                break;
                            }
                            for (int f = 0; f <= 40; f++){
                                sum = a*200 + b*100 + c*50 + d*20 + e*10 + f*5;
                                if (sum >= 200) {
                                    if (sum == 200) answer++;
                                    break;
                                }
                                for (int g = 0; g <= 100; g++){
                                    sum = a*200 + b*100 + c*50 + d*20 + e*10 + f*5 + g*2;
                                    if (sum >= 200) {
                                        if (sum == 200) answer++;
                                        break;
                                    }
                                    for (int h = 0; h <= 200; h++){
                                        sum = a*200 + b*100 + c*50 + d*20 + e*10 + f*5 + g*2 + h*1;
                                        if (sum >= 200) {
                                            if (sum == 200) answer++;
                                            break;
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis(); // start the stopwatch
        System.out.println(differentWays(200));
        long finish = System.currentTimeMillis(); // stop the stopwatch
        System.out.println("Time taken: " + (finish - start) + " milliseconds");
    }

}
