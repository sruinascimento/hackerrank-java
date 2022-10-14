package daily.challenges.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Challenge002JavaStdinStdout {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();



        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bfr.readLine());
        int b = Integer.parseInt(bfr.readLine());
        int c = Integer.parseInt(bfr.readLine());

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
