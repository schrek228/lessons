package lesson2_1_methods;

import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        //Создать класс Rectangle (прямоугольник) с полями(характеристики) a и b - стороны прямоугольника.
        //В мейне создать массив из 10 прямоугольников, заполнить его значениями. Значения для сторон генерировать через случайные числа в диапазоне от 2 до 10.
        //Создать консольное меню:
        //1. Вывести стороны всех прямоугольников (выводит и стороны и площадь, вывод площади сделать через метод)
        //2. Найти прямоугольник с наибольшей площадью
        //3. Найти прямоугольник с наименьшей площадью
        //4. Найти сумму площадей прямоугольника
        //5. Вывести прямоугольники, чья площадь находится в диапазоне от m до n
        //6. Выход
        Rectangle[] arr = new Rectangle[10];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            Rectangle rec = new Rectangle();
            rec.a = rnd.nextInt(1, 10);
            rec.b = rnd.nextInt(1, 10);
            arr[i] = rec;
        }
        //ВЕРНУТЬ значение - return
        //ВЫВЕСТИ - void

        System.out.println("1. Вывести стороны всех прямоугольников ");
        for (int i = 0; i < arr.length; i++) {
            arr[i].print();
        }

        System.out.println("2. Найти прямоугольник с наибольшей площадью");
        Rectangle maxRec = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].square()>maxRec.square()){
                maxRec = arr[i];
            }
        }
        maxRec.print();
    }
}

class Rectangle{
    int a,b;
    public int square(){
        return a*b;
    }
    public void print(){
        System.out.println("Стороны: " + a +", " + b+", square: "+square());
    }
}
