package hws.hw4;

import scn.MyScanner;

import java.util.ArrayList;

public class Tsk5 {
    public static void main(String[] args) {
        ArrayList<Lemon> lemons = new ArrayList<>();
        ArrayList<Apple> apples = new ArrayList<>();
        Apple a1= new Apple();
        a1.price=10;
        a1.name="a1";
        a1.color="red";
        Apple a2= new Apple();
        a2.price=11;
        a2.name="a2";
        a2.color="green";
        Apple a3= new Apple();
        a3.price=12;
        a3.name="a3";
        a3.color="yellow";
        apples.add(a1);
        apples.add(a2);
        apples.add(a3);
        Lemon l1 = new Lemon();
        l1.acid=5;
        l1.name="l1";
        l1.price=10;
        Lemon l2 = new Lemon();
        l2.acid=1;
        l2.name="l2";
        l2.price=11;
        Lemon l3 = new Lemon();
        l3.acid=3;
        l3.name="l2";
        l3.price=12;
        lemons.add(l1);
        lemons.add(l2);
        lemons.add(l3);

        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i).toString());
        }
        for (int i = 0; i < lemons.size(); i++) {
            System.out.println(lemons.get(i).toString());
        }
        System.out.println(Apple.appleFind(apples));

        System.out.println(Lemon.lemonFind(lemons));

    }
}
class Fruit{
    String name;
    int price;
}
class Apple extends Fruit{
    String color;
    public static int appleFind(ArrayList<Apple> l){
        MyScanner scn = new MyScanner();
        int price = 0;
        String name=scn.next("введите название: ");
        String color = scn.next("введите цвет");
        Apple standapple = new Apple();
        //TODO: метод нужно вынести в другое место
        //TODO: заменить цикл на indexOf
        standapple.name=name;
        standapple.color=color;
        for (int i = 0; i < l.size(); i++) {
            if(standapple.equals(l.get(i))){
                 price =  l.get(i).price;
            }else price = 0;
        }
        return price;
    }
    @Override
    public boolean equals(Object o){
        Apple apple = (Apple) o;
        return name.equals(apple.name)&&color.equals(apple.color);
    }
    @Override
    public String toString(){
        return "Name:"+" "+name + " color: "+" "+color +" price: " + price;
    }
}
class Lemon extends Fruit{
    int acid;
    public static int lemonFind(ArrayList<Lemon> l){
        //TODO: метод нужно вынести в другое место
        //TODO: заменить цикл на indexOf
        MyScanner scn = new MyScanner();
        int price=0;
        String name=scn.next("введите название: ");
        int acid = scn.nextInt("введите кислотность: ");
        Lemon standlemon = new Lemon();
        standlemon.name=name;
        standlemon.acid=acid;
        for (int i = 0; i < l.size(); i++) {
            if(standlemon.equals(l.get(i))){
                price = l.get(i).price;
            }
        }
        return price;
    }
    @Override
    public boolean equals(Object o){
        Lemon lemon = (Lemon) o;
        return name.equals(lemon.name)&&acid==(lemon.acid);
    }
    @Override
    public String toString(){
        return "Name:"+" "+name + " acid: "+" "+acid +" price: " + price;
    }
}