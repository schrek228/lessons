package lesson4_2_static_block;

import scn.MyScanner;

public class Main2_not_static_block {
    public static void main(String[] args) {
        //Нестатический блок (экземплярный блок) срабатывает при каждом создании объекта как и конструктор
        Fruit fruit = new Fruit(10);
        System.out.println(fruit);
        Fruit fruit2 = new Fruit(10);
        System.out.println(fruit2);

    }
}


class Fruit{
    String name;
    int price;


    {
        System.out.println("not static block");
        name = new MyScanner().next("Enter name: ");
    }


    public Fruit(int price) {
        System.out.println("constructor");
        this.price = price;
    }

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
