package Edu;

public class EduEnum {
    public static void main(String[] args) {
        EnumDays monday = EnumDays.MONDAY;
        System.out.println(monday);
        System.out.println(monday == EnumDays.MONDAY);
        System.out.println(monday == EnumDays.TUESDAY);
        System.out.println(monday.ordinal());
        System.out.println(EnumDays.TUESDAY.ordinal());
        System.out.println(EnumDays.MONDAY.getDay());
        System.out.println(EnumDays.MONDAY.getIntDay());
    }
}

enum EnumDays {
    SUNDAY("일요일", 0)
    ,MONDAY("월요일", 1)
    ,TUESDAY("화요일", 2)
    ,WEDNESDAY("수요일", 3);

    // 상수 문자열 저장 필드
    private final String day;
    private final int intDay;

    // 싱글톤 생성자
    private EnumDays(String day, int intDay) {
        this.day = day;
        this.intDay = intDay;
    }

    // Getter
    public String getDay() {
        return day;
    }
    public int getIntDay() {
        return intDay;
    }
}

class Enum {
    public static final Enum SUNDAY = new Enum("일요일");
    public static final Enum MONDAY = new Enum("월요일");

    private final String day;

    private Enum(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }
}

//class FinalDaysClass {
//    public static final int MONDAY = 1;
//    public static final int TUESDAY = 2;
//}
//
//interface FinalDaysInterface {
//    int MONDAY = 1;
//    int TUESDAY = 2;
//}
