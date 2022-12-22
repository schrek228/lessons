package lesson4_1_equals_toString;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1.equals(str2));

        Fruit f1 = new Fruit("apple", 10);
        Fruit f2 = new Fruit("apple", 10);

        System.out.println(f1.equals(f2));


        ArrayList<Fruit> list = new ArrayList<>();
        list.add(new Fruit("apple", 10));
        list.add(new Fruit("orange", 20));
        list.add(new Fruit("cherry", 30));
        list.add(new Fruit("qiwi", 40));

        System.out.println();
        System.out.println(list.contains(f1));
        System.out.println(list.indexOf(f1));
        System.out.println(list.remove(f1));
        System.out.println(list.contains(f1));
    }


}
class Fruit{
    String name;
    int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void print(){
        System.out.println(name+" "+price);
    }


    @Override
    public boolean equals(Object o) {
        Fruit fruit = (Fruit) o;
        return name.equals(fruit.name);
    }


}
