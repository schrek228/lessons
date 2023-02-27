package lesson16_2_streams;

import java.util.List;

public class Main1_peek {
    public static void main(String[] args) {
        List<Tovar> tovars = List.of(new Tovar("apple", 10), new Tovar("orange", 20), new Tovar("orange", 20));
        //хотим увеличить цену каждого товара на 2% и вывести товары, чья новая цена меньше 15
        tovars.stream().peek(t -> t.increasePrice(2)).forEach(t -> System.out.println(t));
    }
}
