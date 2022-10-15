package daily.challenges.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Challenge003JavaStdintdout {
    public static void main(String[] args) throws IOException {

        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(sc.readLine());
        double d = Double.parseDouble(sc.readLine());
        String s = sc.readLine();

        System.out.println("String: "+s);
        System.out.println("Double: "+d);
        System.out.println("Int: "+i);
    }
}
