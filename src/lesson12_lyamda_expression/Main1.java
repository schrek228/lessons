package lesson12_lyamda_expression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        //stream api
//        int[] arr = {10,-20,30};
//        Arrays.stream(arr).forEach(val-> System.out.println(val));
//
//        List<Integer> list = Arrays.stream(arr).filter(val -> val > 0).boxed().collect(Collectors.toList());
//        List<Integer> list2 = Arrays.stream(arr).filter(val -> val % 2 == 0).boxed().collect(Collectors.toList());
//        List<Integer> list3 = Arrays.stream(arr).filter(val -> val < 0).boxed().collect(Collectors.toList());
//        System.out.println(list);


        //Реализация интерфейса через анонимный класс
        //
        MyConsumer myConsumer = new MyConsumer() {
            @Override
            public int consume(int a, int b) {
                return a + b;
            }
        };

        System.out.println(myConsumer.consume(2, 3));

        //Реализация интерфейса через лямбда выражение
        //-> - лямбда оператор - он отделяет параметры (пишутся слева) от реалзации метода (пишется справа)
        //Лямбду можно реализовать только на основе ФУНКЦИОНАЛЬНОГО интерфейса
        //ФУНКЦИОНАЛЬНЫЙ интерфейс - интерфейс с одним абстрактным методом
        MyConsumer myConsumer2 = (a, b) -> a + b;
        System.out.println(myConsumer2.consume(2, 3));

        //Создать лямбду, возвращающую наибольшее из двух чисел
        //вариант 1: короткая лямбда
        MyConsumer myConsumer3 = (a,b) -> Math.max(a,b);
        //вариант 2: расширенная версия
        MyConsumer myConsumer4 = (a,b) -> {
            if(a>=b) {
                return a;
            }
            return b;
        };
        System.out.println(myConsumer3.consume(1,8));

    }
}
//ФУНКЦИОНАЛЬНЫЙ интерфейс
interface MyConsumer {
    int consume(int a, int b);
}
