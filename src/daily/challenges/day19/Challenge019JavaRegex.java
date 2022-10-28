package daily.challenges.day19;


import java.util.Scanner;

public class Challenge019JavaRegex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()) {
            String ip = input.next();
            System.out.println(ip.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    String pattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
}
