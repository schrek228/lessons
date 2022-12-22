package lesson3_3_array_list;

import scn.MyScanner;

import java.util.ArrayList;
import java.util.Objects;

public class Main3 {
    public static void main(String[] args) {
        //Для работы с методами contains, remove по значению, indexOf нужно ОБЯЗАТЕЛЬНО переопределить метод equals в классе Fruit
        ArrayList<Fruit> list = new ArrayList<>();
        list.add(new Fruit("apple", 10));
        list.add(new Fruit("orange", 20));
        list.add(new Fruit("cherry", 30));
        list.add(new Fruit("qiwi", 40));

        System.out.println(list);

        //юзер вводит с консоли название фрукта, найти его цену
        MyScanner scn = new MyScanner();
        String name = scn.next("Enter name: ");

        System.out.println(list.contains(new Fruit(name)));
        System.out.println(list.indexOf(new Fruit(name)));
        System.out.println(list.remove(new Fruit(name)));
        for (int i = 0; i < list.size(); i++) {
            list.get(i).print();
        }


    }
}

class Fruit{
    String name;
    int price;

    public Fruit(String name) {
        this.name = name;
    }

    public Fruit(String name, int price) {
        this(name);
        this.price = price;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(name, fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    void print(){
        System.out.println(name+" "+price);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
