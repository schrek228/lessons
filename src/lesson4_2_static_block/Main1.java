package lesson4_2_static_block;

import scn.MyScanner;

public class Main1 {
    public static void main(String[] args) {
        //Статический блок (статический конструктор) срабатывает автоматически один раз в момент первого обращения к полю или методу класса
        System.out.println(MyMath.g);

        System.out.println(MyMath.calcF(100));
        System.out.println(MyMath.calcF(100));
        System.out.println(MyMath.calcF(100));

    }
}

class MyMath{

    static double g;

    static {
        System.out.println("static block");
        g = new MyScanner().nextInt("Enter g: ");
    }

    public static double calcPowerOfTiajesti(double mass){
        return mass * g / 2;
    }

    public static double calcF(double mass){
        return mass * g * 2;
    }
}
