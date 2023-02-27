package lesson15_2_stream;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class Main1_filter_foreach {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,-20,31,-40);
        list.stream().forEach(val-> System.out.print(val+" "));
        System.out.println();

        //Вывести только положительные числа
        list.stream().filter(val->val>0).forEach(val-> System.out.print(val+" "));
        System.out.println();

        //Сохранить в файл только четные числа
        try(PrintWriter pw = new PrintWriter("src/lesson15_2_stream/file.txt")) {
            list.stream().filter(val -> val % 2 == 0).forEach(val -> pw.println(val));
        }catch (Exception e){
            e.printStackTrace();
        }


        //Вывести только те товары, чья цена меньеш 500
        List<Tovar> tovars = List.of(
                new Tovar("tovar1", 2000),
                new Tovar("tovar2", 20),
                new Tovar("tovar3", 100)
        );

        tovars.stream().filter(tovar->tovar.price<500).forEach(tovar -> System.out.println(tovar));


        //стрим по массиву
        int[] arr = {10,20,30,40};
        Arrays.stream(arr).forEach(val-> System.out.println(val));


    }
}

