package lesson16_2_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main2_flatMap {
    public static void main(String[] args) {
        int[][] doublyArray = {
                {6,-4,1},
                {-2,1,5}
        };

        //Вывести элементы массива на консоль
        //Arrays.stream(doublyArray).forEach(arr-> System.out.println(Arrays.toString(arr)));

        //Вывести только положительные элементы на консоль
        //flatMap
        //flatMapToInt
        //flatMapToLong
        //flatMapToDouble

        //Stream<int[]> -> Stream<IntStream> -> IntStream
        Arrays.stream(doublyArray).flatMapToInt(arr -> Arrays.stream(arr)).filter(val-> val > 0).forEach(val-> System.out.println(val));
//        Stream<IntStream> intStreamStream = Arrays.stream(doublyArray).map(arr -> Arrays.stream(arr)); //было
        IntStream intStream = Arrays.stream(doublyArray).flatMapToInt(arr -> Arrays.stream(arr)); //стало


        //Сформировать список, содержащий только названия товаров дешевле 500
        Tovar[][] tovars2D = {
                {new Tovar("tovar1", 10), new Tovar("tovar2", 1000)},
                {new Tovar("tovar3", 15), new Tovar("tovar4", 900)}
        };
        List<String> collect = Arrays.stream(tovars2D)
                .flatMap(arr -> Arrays.stream(arr))
                .filter(t -> t.price < 500)
                .map(t -> t.name)
                .collect(Collectors.toList());
        System.out.println(collect);


    }
}
