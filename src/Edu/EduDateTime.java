package Edu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class EduDateTime {
    public static void main(String[] args) {
        // LocalDate Class
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);

        System.out.println(nowDate.getYear()); // 년도
        System.out.println(nowDate.getMonth()); // 월 영어
        System.out.println(nowDate.getMonthValue()); // 월 숫자
        System.out.println(nowDate.getDayOfMonth()); // 날짜
        System.out.println(nowDate.getDayOfWeek()); // 요일 영어
        System.out.println(nowDate.getDayOfWeek().getValue()); // 요일 숫자
        System.out.println(nowDate.lengthOfMonth()); // 현재 달의 일수
        System.out.println(nowDate.lengthOfYear()); // 해당 연도의 일수

        // 한국 월, 요일로 변환
        String tmp = nowDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN);
        String tmp2 = nowDate.getMonth().getDisplayName(TextStyle.FULL, Locale.KOREA);
        System.out.println(tmp);
        System.out.println(tmp2);

        // LocalTime
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);
        System.out.println(nowTime.getHour()); // 시
        System.out.println(nowTime.getMinute()); // 분
        System.out.println(nowTime.getSecond()); // 초
        System.out.println(nowTime.getNano()); // 나노초

        // LocalDateTime
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println(nowDateTime);
        System.out.println(nowDateTime.getYear());
        System.out.println(nowDateTime.getMonth());
        System.out.println(nowDateTime.getDayOfMonth());
        System.out.println(nowDateTime.getDayOfWeek().getValue());
        System.out.println(nowDateTime.getHour());
        System.out.println(nowDateTime.getMinute());
        System.out.println(nowDateTime.getSecond());
        System.out.println(nowDateTime.getNano());

        System.out.println(nowDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")));

        // 날짜 비교
        LocalDateTime nowDateTime2 = LocalDateTime.of(2024, 2, 24, 12, 00, 00);
        System.out.println(nowDateTime2);
        long dateCompare = nowDateTime.until(nowDateTime2, ChronoUnit.DAYS);
        System.out.println(dateCompare);
        System.out.println(Math.abs(dateCompare));

        // 날짜 비교해서 과거인지 미래인지 같은 날짜인지 확인
        boolean boo = nowDateTime.isBefore(nowDateTime2);
        boolean boo2 = nowDateTime.isAfter(nowDateTime2);
        boolean boo3 = nowDateTime.isEqual(nowDateTime2);
        System.out.println(boo);
        System.out.println(boo2);
        System.out.println(boo3);

        // 해당 달의 마지막 일
        LocalDateTime lastDay = nowDateTime.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(lastDay.getDayOfMonth());
    }
}
