package practice12_15.n4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {
    String form_num;

    public Phone(String num) {
        if (num.charAt(0)!='+'){
            num = "+7"+num.substring(1);
        }

        String regex = "(\\+\\d+)(\\d{3})(\\d{3})(\\d{4})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(num);
        matcher.find();
        form_num = matcher.group(1)+matcher.group(2)+"-"+matcher.group(3)+"-"+matcher.group(4);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "form_num='" + form_num + '\'' +
                '}';
    }
}
