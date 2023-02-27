package lesson16_1_stream;

import java.util.List;

public class Main2_mapToInt {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4);
//        Stream<Integer> stream = list.stream();
//        IntStream intStream = stream.mapToInt(t -> t);
//        int sum = intStream.sum();
//        System.out.println(sum);


        System.out.println(list.stream().mapToInt(t -> t).sum());


        //Есть корзина товаров, подсчитать их сумму
        List<Tovar> tovars = List.of(new Tovar("apple", 10), new Tovar("orange", 20));
        int sum = tovars.stream().mapToInt(t -> t.price).sum();
        System.out.println(sum);

        //map           Stream<T>
        //mapToInt      IntStream
        //mapToDouble   DoubleStream
        //mapToLong     LongStream
        //mapToObj      Stream<T>
    }
}
