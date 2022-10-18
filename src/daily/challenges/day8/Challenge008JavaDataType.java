package daily.challenges.day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Challenge008JavaDataType {
    public static void main(String[] args) throws IOException {

            BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
            int T = Integer.valueOf(bufferedReader.readLine());
            String n;
            for (int i = 0; i < T; i++) {
                    n = bufferedReader.readLine();
                try {
                    long nLong = Long.valueOf(n);
                    System.out.println(nLong + " can be fitted in:");
                    if (nLong >= Byte.MIN_VALUE && nLong <= Byte.MAX_VALUE) System.out.println("* byte");
                    if (nLong >= Short.MIN_VALUE && nLong <= Short.MAX_VALUE) System.out.println("* short");
                    if (nLong >= Integer.MIN_VALUE && nLong <= Integer.MAX_VALUE) System.out.println("* int");
                    System.out.println("* long");
                } catch (Exception e) {
                    System.out.println(n + " can't be fitted anywhere.");
                }
            }
    }

}
