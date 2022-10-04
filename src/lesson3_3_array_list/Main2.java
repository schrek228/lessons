package lesson3_3_array_list;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        System.out.println(list);

        System.out.println(list.contains("two"));

        list.remove("two");
        System.out.println(list);
        System.out.println(list.indexOf("two"));

    }
}
