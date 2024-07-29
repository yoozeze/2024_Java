package Edu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EduRegex {
    public static void main(String[] args) {
        // String Class 이용
        String str = "Hello World";
        String pattern1 = "[0-9]+";  // 숫자
        String pattern2 = "[a-zA-Z]+";  // 알파벳
        String pattern3 = "[a-zA-Z ]+"; // 알파벳  + 띄어쓰기
        System.out.println(str.matches(pattern1));
        System.out.println(str.matches(pattern2));
        System.out.println(str.matches(pattern3));

        // Regex Package 이용
        Pattern pattern4 = Pattern.compile("[0-9]+");
        Pattern pattern5 = Pattern.compile("[a-zA-Z ]+");

        Matcher matcher4 = pattern4.matcher(str);
        Matcher matcher5 = pattern5.matcher(str);

        System.out.println(matcher4.matches());
        System.out.println(matcher5.matches());
    }
}
