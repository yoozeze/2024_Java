package Edu;

import java.util.Scanner;

public class EduString {
    public static void main(String[] args) {
        String str1 = "안녕";
        String str2 = "안녕";

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        String str3 = "자바";
        str3 = "PHP";
        System.out.println(str3);

        String str4 = "안녕하세요. 자바입니다.";

        // charAt()
        System.out.println(str4.charAt(3));

        // format()
        System.out.println(String.format("%s : 비밀번호 오류", "E10"));

        // equals()
        System.out.println(str1.equals(str2));

        // length()
        System.out.println(str4.length());

        // replace()
        String tmp = str4.replace("자바", "PHP");
        System.out.println(tmp);

        // join()
        String[] stringArr = {"자바", "C#", "PHP"};
        System.out.println(String.join("/",stringArr));

        // toLowerCase(), toUpperCase()
        String caseStr = "ASDwdd";
        System.out.println(caseStr.toLowerCase());
        System.out.println(caseStr.toUpperCase());

        // trim()
        String trimStr = "        asdasdas  ";
        System.out.println(trimStr.trim());

        // -------------------------------------------------------------
        // StringBuffer Class / StringBuilder Class
        StringBuffer sb = new StringBuffer("안녕 자바!");

        System.out.println(sb);
        System.out.println(sb.toString());

        sb.append("안녕 PHP!");
        System.out.println(sb.toString());

        // Math Class
        int num1 = -5;

        // 절댓값
        System.out.println(Math.abs(num1));

        // 올림
        System.out.println(Math.ceil(2.56));

        // 내림
        System.out.println(Math.floor(2.56));

        // 반올림
        System.out.println(Math.round(2.56));

        // 랜덤
        System.out.println(Math.random());

        // 1 ~ 10 까지 랜덤 숫자 획득

        // floor이용
        double num2 = Math.floor((Math.random() * 10) + 1);
        System.out.println(num2);

        // 강제 형변환
        int num3 = (int)((Math.random() * 10) + 1);
        System.out.println(num3);

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.printf("입력하신 값은 %s입니다.", input);

    }
}
