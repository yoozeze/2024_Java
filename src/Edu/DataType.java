package Edu;

public class DataType {
    public static void main(String[] args) {
        boolean flg = true;

        byte numByte = 127;
        short numShort = 32767;
        int numInt = 1;
        long numLong = 5L;

        double numDouble = 5.0;
        float numFloat = 5.0f;

        char enChar = 'A';
        String enString = "A";

        // 연산자 ( 변수를 선언할때 이미 데이터타입을 정했기때문에 === 없음 )
        int num1 =1;
        int num2 =2;

        System.out.println(num1 == num2);
        System.out.println(num1 != num2);

        // 문자열 비교
        String str2 = "asd";
        String str3 = "asd";
        String str4 = "123";
        System.out.println(str2 == str3);
        System.out.println(str2.equals(str4));

    }
}
