package daily.challenges.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Challenge005JavaLoops {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if (N >= 2 && N <= 20) {
            for (int i = 1; i < 11; i++) {
                System.out.printf("%d x %d = %d%n", N, i, (N * i));
            }
        } else {
            System.out.printf("Number %d is invalid.", N);
        }

        bufferedReader.close();
    }
}
