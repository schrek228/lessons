package lesson3_3_array_list;

import scn.MyScanner;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        //Методы contains, remove по значению, indexOf не будут работать с объектами
        ArrayList<Fruit> list = new ArrayList<>();
        list.add(new Fruit("apple", 10));
        list.add(new Fruit("orange", 20));
        list.add(new Fruit("cherry", 30));
        list.add(new Fruit("qiwi", 40));


        for (int i = 0; i < list.size(); i++) {
            list.get(i).print();
        }

        //юзер вводит с консоли название фрукта, найти его цену
        MyScanner scn = new MyScanner();
        String name = scn.next("Enter name: ");
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).name.equals(name)){
                index = i;
            }
        }
        if(index == -1){
            System.out.println("Фрукт не найден");
        }else{
            System.out.println("Цена фрукта: "+list.get(index).price);
        }
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
}
