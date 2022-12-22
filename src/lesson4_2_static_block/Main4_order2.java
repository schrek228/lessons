package lesson4_2_static_block;

import scn.MyScanner;

public class Main4_order2 {
    public static void main(String[] args) {
        //Очередность срабатывания блоков
        Milk milk = new Milk(10);
        System.out.println(milk);
        //1. Статический блок родителя
        //2. Статический блок наследника
        //3. Нестатический блок родителя
        //4. Нестатический блок наследника
        //5. Констрктор наследника
    }
}

class Product{
    final static String county;
    int days;
    static{
        System.out.println("parent static block");
        county = new MyScanner().next("Enter country: ");
    }

    {
        System.out.println("parent not static block");
        days = new MyScanner().nextInt("Enter days: ");
    }
}

class Milk extends Product{
    String name;
    int price;
    final static String mark;

    static{
        System.out.println("static block");
        mark = new MyScanner().next("Enter mark: ");
    }

    {
        System.out.println("not static block");
        name = new MyScanner().next("Enter name: ");
    }


    public Milk(int price) {
        System.out.println("constructor");
        this.price = price;
    }


    @Override
    public String toString() {
        return "Milk{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}