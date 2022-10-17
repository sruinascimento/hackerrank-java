package daily.challenges.day6;

import java.util.Scanner;

public class Challenge006JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;


        while (true) {
            String line = scanner.nextLine().trim();
            count++;
            if (line.contains("end-of-file")) {
                System.out.println(count + " " + line);
                break;
            }
            System.out.println(count + " " + line);

        }

    }
}
