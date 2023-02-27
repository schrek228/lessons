package hws.hw16;



import scn.MyScanner;

import java.util.List;
import java.util.Random;


public class tsk5 {
    public static void main(String[] args) {
        MyScanner scn = new MyScanner();
        List<Fruit> fruits = new Random().ints(5, 2, 12).mapToObj(t -> new Fruit(t, scn.next("name: "))).toList();
        System.out.println(fruits);

    }
}
class Fruit{
    int price;
    String name;

    public Fruit(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
