package Edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EDuStream {
    public static void main(String[] args) {
        // List로 스트림 생성
        List<String> list = new ArrayList<String>();
        list.add("김밥");
        list.add("소고기");
        list.add("백반");
        list.add("소불고기");

        Stream<String> stream = list.stream();
        stream.filter(str -> str.startsWith("소"))
                .forEach(System.out::println);

        // 배열
        int[] arr = {5, 4, 1, 68, 7, 1, 12};
        // 인트 배열로 스트림 생성
        IntStream intSteam = Arrays.stream(arr);
        intSteam.sorted()
                .distinct()
                .forEach(System.out::println);
    }
}
