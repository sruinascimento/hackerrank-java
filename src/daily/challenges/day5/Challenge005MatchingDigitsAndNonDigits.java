package daily.challenges.day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge005MatchingDigitsAndNonDigits {
    public static void main(String[] args) {

        String target = "06-11-2015";
        String regex = "\\d{2}\\D\\d{2}\\D\\d{4}";

        Matcher matcher = Pattern.compile(regex).matcher(target);
        System.out.println(matcher.find());
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }



    }
}
