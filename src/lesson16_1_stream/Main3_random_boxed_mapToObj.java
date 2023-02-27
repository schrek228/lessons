package lesson16_1_stream;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main3_random_boxed_mapToObj {
    public static void main(String[] args) {
        //Сгенерируем 5 случ чисел в диапазоне от -10 до 10 и сохраним их в массив
        int[] arr = new Random().ints(5, -10, 10).toArray();

        //Сгенерируем 5 случ чисел в диапазоне от -10 до 10 и сохраним их в список
//        List<Integer> collect = new Random().ints(5, -10, 10).mapToObj(t -> t).collect(Collectors.toList());
        //метод mapToObj можно заменить на boxed и будет красивее
        List<Integer> collect = new Random().ints(5, -10, 10).boxed().collect(Collectors.toList());
        System.out.println(collect);

        //Создать 5 Human со случайным ростом и весом и сохранить их в коллекцию
        List<Human> collect1 = new Random().ints(5, 0, 200).mapToObj(t -> new Human(t, t)).collect(Collectors.toList());

    }
}

class Human{
    int height;
    int weight;

    public Human(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
