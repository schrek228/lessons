package lesson15_2_stream;

import java.util.Arrays;
import java.util.List;

public class Main3_sum_count {
    public static void main(String[] args) {
        int[] arr = {10,-20,30,-40};
        System.out.println(Arrays.stream(arr).sum());


        //Посчитать сколько положительных чисел
        System.out.println(Arrays.stream(arr).filter(val -> val > 0).count());

        //Посчитать сколько товаров меньше 500 по цене
        List<Tovar> tovars = List.of(
                new Tovar("tovar1", 2000),
                new Tovar("tovar2", 20),
                new Tovar("tovar3", 100)
        );
        System.out.println(tovars.stream().filter(tovar -> tovar.price < 500).count());
    }
}
