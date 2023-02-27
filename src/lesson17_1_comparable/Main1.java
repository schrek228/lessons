package lesson17_1_comparable;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10, 4, 3, 50));
        list.sort(null);
        System.out.println(list);

        String str1 = "a";
        String str2 = "b";
        //если объект, у которого вызывается метод меньше второго объекта, вернется отрицательное число
        //если объект, у которого вызывается метод больше второго объекта, вернется положительное число
        //если объект, у которого вызывается метод равен второму объекту, вернется число 0
        System.out.println(str1.compareTo(str2));
        if (str1.compareTo(str2) < 0) {
            System.out.println(str1 + " меньше " + str2);
        }

        List<String> list2 = new ArrayList<>(List.of("bank", "apple", "car"));
        list2.sort(null);
        System.out.println(list2);


        List<Fruit> fruits = new ArrayList<>(List.of(
                new Fruit("apple", 20),
                new Fruit("qiwi", 10),
                new Fruit("apple", 10),
                new Fruit("apple", 15),
                new Fruit("orange", 2)));
        fruits.sort(null);
        fruits.forEach(t -> System.out.println(t));


    }
}


