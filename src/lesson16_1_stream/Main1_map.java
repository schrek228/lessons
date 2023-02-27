package lesson16_1_stream;

import java.util.List;
import java.util.stream.Collectors;

public class Main1_map {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,3,4,5,6);
//        List<Integer> collect = list.stream().map(t -> t * 2).collect(Collectors.toList());
        List<Integer> collect = list.stream().map(t->t*2).collect(Collectors.toList());
        System.out.println(collect);

        List<String> list2 = List.of("2","3","4","5");
        List<Integer> collect1 = list2.stream().map(t -> Integer.parseInt(t)).collect(Collectors.toList());

        //Сформировать из коллекции товаров коллекцию наименований этих товаров
        List<Tovar> tovars = List.of(new Tovar("apple", 10), new Tovar("orange", 20));
        List<String> names = tovars.stream().map(t->t.name).collect(Collectors.toList());
        System.out.println(names);

    }
}
