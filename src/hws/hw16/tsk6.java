package hws.hw16;

import java.util.List;
import java.util.stream.Collectors;

public class tsk6 {
    public static void main(String[] args) {
        List<Car> cars = List.of(new Car("Audi", "a4", "white", 2),
                new Car("Audi", "a4", "black", 3),
                new Car("Audi", "a4", "red", 3),
                new Car("BMW", "5", "white", 3),
                new Car("BMW", "7", "black", 4),
                new Car("BMW", "5", "green", 2));
        String collect = cars.stream().map(t -> t.name).distinct().collect(Collectors.joining("; "));
        System.out.println(collect);
        String colors = cars.stream().map(t -> t.color).distinct().collect(Collectors.joining("; "));
        System.out.println(colors);
        System.out.println(cars.stream().map(t -> String.valueOf(t.volume)).distinct().collect(Collectors.joining(", ","volume: "," litres")));
    }
}
class Car{
    String name;
    String model;
    String color;
    double volume;

    public Car(String name, String model, String color, double volume) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.volume = volume;
    }
}