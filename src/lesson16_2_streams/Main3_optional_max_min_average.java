package lesson16_2_streams;

import java.util.*;
import java.util.stream.Stream;

public class Main3_optional_max_min_average {
    public static void main(String[] args) {
//        int[] arr = new int[0];
        int[] arr = {10,30,5};
        //Optional защищает от NPE (null pointer exception) и предлагает удобные способы по его обработке
        OptionalInt max = Arrays.stream(arr).max();

        max.ifPresentOrElse(t-> System.out.println("max = "+t),
                ()-> System.out.println("Максимум не найден"));


        //or else
//        int maxValue = max.orElse(0);
//        System.out.println(maxValue);


//        if(!max.isEmpty()) {
//            System.out.println("max = "+max.getAsInt());
//        }else{
//            System.out.println("Максимум не найден");
//        }

        //Найдем минимум:
        Arrays.stream(arr).min().ifPresentOrElse(t-> System.out.println("min = "+t),
                ()-> System.out.println("Минимум не найден"));

        //Найти среднее арфиметическое
        System.out.println("average = "+Arrays.stream(arr).average().orElse(0));


        //Optional<T>
        //OptionalInt
        //OptionalDouble
        //OptionalLong

        //То же самое через список
        //MAX and MIN
        List<Integer> list = List.of(10,30,5);
        OptionalInt max2 = list.stream().mapToInt(t -> t).max();
        OptionalInt min2 = list.stream().mapToInt(t -> t).min();
        OptionalDouble average = list.stream().mapToInt(t -> t).average();
        System.out.println(max2.orElse(0));
        System.out.println(min2.orElse(0));
        System.out.println(average.orElse(0));

        //через компаратор
        Optional<Integer> max3 = list.stream().max((t1, t2) -> t1 - t2);
        max3.ifPresentOrElse(t-> System.out.println("max = "+t),
                ()-> System.out.println("Максимум не найден"));


        

    }
}

