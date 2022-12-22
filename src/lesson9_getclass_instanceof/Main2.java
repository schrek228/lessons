package lesson9_getclass_instanceof;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        //Более яркий пример, когда нужен instance of


        //Создать суперкласс Animal, создать два подкласса: млекопитающие и земноводные. Создать подклассы млекопитающих: кот, собака.
        // Создать подклассы земноводных: рыба, черепаха. В мейне создать список типа Animal и консольное меню:


        List<Animal> list = new ArrayList<>();
        list.add(new Cat(2));
        list.add(new Dog(5));
        list.add(new Fish(1));
        list.add(new Turtle(50));

        System.out.println("1. Вывести всех млекопитающих");
        for (Animal animal : list) {
            if(animal instanceof Mlecopit){
                System.out.println(animal);
            }
        }

        System.out.println("2. Вывести всех земноводных");
        for (Animal animal : list) {
            if(animal instanceof Zemnovod){
                System.out.println(animal);
            }
        }




    }
}

class Turtle extends Zemnovod{

    public Turtle(int age) {
        super(age);
    }
}
class Fish extends Zemnovod{

    public Fish(int age) {
        super(age);
    }
}
class Dog extends Mlecopit{

    public Dog(int age) {
        super(age);
    }
}

class Cat extends Mlecopit{

    public Cat(int age) {
        super(age);
    }
}

class Zemnovod extends Animal{

    public Zemnovod(int age) {
        super( age);
    }
}

class Mlecopit extends Animal{

    public Mlecopit(int age) {
        super(age);
    }
}

class Animal{

    int age;

    public Animal(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+" "+age;
    }
}
