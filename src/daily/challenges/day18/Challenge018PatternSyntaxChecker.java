package daily.challenges.day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Challenge018PatternSyntaxChecker {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            try {
                String regex = bufferedReader.readLine();
                Pattern.compile(regex);
                System.out.println("Valid");
            } catch (PatternSyntaxException ignored) {
                System.out.println("Invalid");
            }
        }
    }
}
