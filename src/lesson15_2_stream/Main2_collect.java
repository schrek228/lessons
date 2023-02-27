package lesson15_2_stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main2_collect {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,-20,31,-40, -20);

        //Сформировать новую коллекцию только на основе четных чисел
        List<Integer> list2 = list.stream().filter(val -> val % 2 == 0).collect(Collectors.toList());
        System.out.println(list2);

        Set<Integer> set = list.stream().filter(val -> val % 2 == 0).collect(Collectors.toSet());
        System.out.println(set);


        //Сформировать коллекцию товаров, чья цена меньше 500
        List<Tovar> tovars = List.of(
                new Tovar("tovar1", 2000),
                new Tovar("tovar2", 20),
                new Tovar("tovar3", 100)
        );
        List<Tovar> collect = tovars.stream().filter(tovar -> tovar.price < 500).collect(Collectors.toList());
        System.out.println(collect);

    }
}
