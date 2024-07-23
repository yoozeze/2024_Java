package Edu;

public class ControllStatement {
    public static void main(String[] args) {
        // if 문
//        if(조건1) {
//            // 처리 코드
//        } else if (조건2) {
//            // 처리 코드
//        } else {
//            // 처리 코드
//        }
        // switch 문
        String food = "뚝배기";
        switch (food) {
            case "김밥" :
                System.out.println("분식");
                break;
            case "뚝배기" :
                System.out.println("한식");
                break;
            default:
                System.out.println("기타");
                break;
        }

        // for 문
        for (int i = 0; i < 3; i ++) {
            if( i == 1 ) {
                continue;
            }
            if ( i == 2 ) {
                break;
            }
            System.out.println(i);
        }

        // 구구단
        for (int i = 1; i < 10; i ++) {
            System.out.println(i + "단");
            for (int j = 1; j < 10; j ++) {
//                System.out.println(i + "x" + j + "="+ (i*j));
//                System.out.println(i*j);
                System.out.printf("%d x %d = %d%n", i, j, i*j);
            }
        }

        //     *
        //    **
        //   ***
        //  ****
        // *****

        int count = 5;
        for (int i = 1; i <= count; i ++) {
            // 공백 출력
            for (int j = 1; j <= (count - i); j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
