package lesson8_1_polymofizm_super;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        //Есть класс Rectangle и Circle
        //В обоих классах должен быть метод расчета площади

        //В мейне создать список из 4-х фигур и у каждой вывести площадь
        ArrayList<Shape> list= new ArrayList<>();
        list.add(new Rectangle(2,3));
        list.add(new Circle(3));
        list.add(new Rectangle(21,31));
        list.add(new Circle(31));

        for (Shape shape : list) {
            System.out.println(shape.getSquare());  //пример полиморфизма (когда одни метод работает по разному для каждого объекта)
        }

    }
}
class Shape{
    //создаем метод-пустнышку, чтобы в цикле в мейне можно было его вызвать, иначе он будет недоступен
    public double getSquare(){
        return 0;
    }
}

class Rectangle extends Shape{
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double getSquare(){
        return a*b;
    }
}

class Circle extends Shape{
    int r;

    public Circle(int r) {
        this.r = r;
    }

    public double getSquare(){
        return Math.PI*r*r;
    }
}

