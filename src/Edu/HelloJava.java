package Edu;

public class HelloJava {
    public static void main(String[] args) {
//        System.out.println("Hello World");

        // 변수
        int num = 1;

        // 상수
        final int num2 = 2;
//        num2 = 1; 상수이기 때문에 재할당 불가

        // 언더 스코어 표기법 : 콤마 대신해서 보기 싶게 해줌
        final int num3 = 200_000;

        // 스왑
        // swap1 과 swap2를 값을 서로 변경해주세요.
        int swap1 = 10;
        int swap2 = 30;

        int swap3 = swap1;
        int swap4 = swap2;

        swap1 = swap4;
        swap2 = swap3;

        System.out.println("1번 " + swap1);
        System.out.println("2번 " + swap2);
        System.out.println("3번 " + swap3);
        System.out.println("4번 " + swap4);

        int tmp;
        tmp = swap1;
        swap1 = swap2;
        swap2 = tmp;

        System.out.printf("swap1 = %d, swap2 = %d", swap1, swap2);

    }
}
