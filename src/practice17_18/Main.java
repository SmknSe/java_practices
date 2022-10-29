package practice17_18;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
        public static boolean check(String str, String r) {
            Pattern pattern = Pattern.compile(r);
            Matcher matcher = pattern.matcher(str);

            return matcher.find();
        }

        public static void main(String[] args) {
            String test1 = "abcdefghijklmnopqrstuv18340";
            String test2 = "abcdefghijklmnoasdfasdpqrstuv18340";

            String r = "^abcdefghijklmnopqrstuv18340$";
            System.out.println(check(test1, r));
            System.out.println(check(test2, r));

            test1 = "aE:dC:cA:56:76:54";
            test2 = "01:23:45:67:89:Az";
            r = "^[a-z][A-Z]:[a-z][A-Z]:[a-z][A-Z]:\\d{2}:\\d{2}:\\d{2}$";
            System.out.println(check(test1, r));
            System.out.println(check(test2, r));

            test1 = "Text 23.78 USD smth";
            test2 = "Text 22 UDD, 0.002 USD smth";
            r = "\\d+\\.\\d{1,2} (USD)|(RUR)|(EU)";
            System.out.println(check(test1, r));

            System.out.println(check(test2, r));
        }
}
