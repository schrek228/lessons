package lesson4_1_equals_toString;

import scn.MyScanner;

import java.util.ArrayList;
import java.util.Objects;

public class Main2 {
    public static void main(String[] args) {
        ///Создать класс Phone с полями название модели, количество памяти, цена, цвет.
        //Два телефона считаются одинаковыми, если у них совпадает название, память и цвет.
        //В мейне создать массив объектов Phone и создать консольное меню:
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1.equals(str2));
        System.out.println(Objects.equals(str1,str2));

        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Phone("phone1", 10, "green", 100));
        phones.add(new Phone("phone3", 11, "green", 110));
        phones.add(new Phone("phone4", 12, "red", 120));

        //Юзер вводит с консоли название(модель),память и цвет телефона, программа должна найти этот телефон в списке и вывести его цену
        MyScanner scn = new MyScanner();
        String model = scn.next("Enter modeL: ");
        String color = scn.next("Enter color: ");
        int memory = scn.nextInt("Enter memory: ");

        int index = phones.indexOf(new Phone(model, memory, color));
        System.out.println(phones.get(index).price);


    }
}
class Phone{
    String model;
    int memory;
    String color;
    double price;

    public Phone(String model, int memory, String color, double price) {
        this(model, memory, color);
        this.price = price;
    }

    public Phone(String model, int memory, String color) {
        this.model = model;
        this.memory = memory;
        this.color = color;

    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return memory == phone.memory && Objects.equals(model, phone.model) && Objects.equals(color, phone.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, memory, color);
    }
}