package lesson11_1_abstract_classes;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        //Реализовать абстрактный класс Weapon с методом shot.
        //Реализовать абстрактный класс Weapon с методом shot. Создать два абстрактных подкласса:
        // игровое оружие и боевое. От каждого класса создать по два наследника. В мейне вызвать у всех наследников метод shot.
        List<Weapon> list = new ArrayList<>();
        list.add(new WaterPistol(3));
//        list.add(new Rogatka(3));
        list.add(new Ak47("12d345"));
//        list.add(new Glock("12d345"));

        //Сделать выстрел из всех игровых оружий
        for (Weapon weapon : list) {
            if(weapon instanceof GameWeapon){
                weapon.shot();
            }
        }




    }
}

abstract class Weapon{
    public abstract void shot();
}
abstract class GameWeapon extends Weapon{
    int age;

    public GameWeapon(int age) {
        this.age = age;
    }
}

abstract class RealWeapon extends Weapon{
    String serialNumber;

    public RealWeapon(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}

class WaterPistol extends GameWeapon{


    public WaterPistol(int age) {
        super(age);
    }

    @Override
    public void shot() {
        System.out.println("Набираем воду");
        System.out.println("Делаем выстрел водой");
    }
}


class Ak47 extends RealWeapon{

    public Ak47(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void shot() {
        System.out.println("Выстрел из АК. Урон 1000");
    }
}
