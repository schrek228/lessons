package lesson16_1_stream;

import java.util.List;
import java.util.stream.Collectors;

public class Main4_join_distinct {
    public static void main(String[] args) {
        List<String> list = List.of("one", "two", "three", "two");
        //Вывести все строки через запятую с пробелом
        String collect = list.stream().collect(Collectors.joining(", "));
        System.out.println(collect);

        //вывести на консоль только уникальные строки из list
        System.out.println(list.stream().distinct().collect(Collectors.joining(", ")));

        //Вывести все строки через запятую с пробелом, вначале вывода поставить приставку "все строки:", а в конце поставить суффикс в виде точки
        System.out.println(list.stream().collect(Collectors.joining(", ", "все строки: ", ".")));


        //Есть список товаров. Получить строчку с его название-цена, где каждый товар с новой строки
        List<Tovar> tovars = List.of(new Tovar("apple", 10), new Tovar("orange", 20), new Tovar("orange", 20));

        System.out.println(tovars.stream().map(t -> t.name + "-" + t.price).collect(Collectors.joining("\n")));

        System.out.println("Вывести только уникальные товары");
        System.out.println(tovars.stream().map(t -> t.name + "-" + t.price).distinct().collect(Collectors.joining("\n")));


    }
}
