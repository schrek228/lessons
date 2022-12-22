package lesson4_2_static_block;

import scn.MyScanner;

public class Main3_order {
    public static void main(String[] args) {
        //Очередность срабатывания блоков
        System.out.println(Car.mark);
        Car car = new Car(10);
        Car car2 = new Car(20);
        System.out.println(car);
        System.out.println(car2);

        //1. Статический блок
        //2. Нестатический блок родителя
        //3. Констрктор наследника
    }


}
class Car{
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


    public Car(int price) {
        System.out.println("constructor");
        this.price = price;
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}