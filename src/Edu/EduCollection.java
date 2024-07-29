package Edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EduCollection {
    public static void main(String[] args) {
        // ArrayList Class
        ArrayList<String> list = new ArrayList<>();
        list.add("D");
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list.toString());

        System.out.println(list.get(2));
        list.remove(2);
        System.out.println(list.toString());

        Collections.sort(list); // 정렬
        System.out.println(list.toString());

        // LinkedList Class
        List<String> LinkedList = new LinkedList<>();
        LinkedList.add("E");
        LinkedList.add("A");
        LinkedList.add("B");
        LinkedList.add("C");
        System.out.println(LinkedList.toString());

    }
}
