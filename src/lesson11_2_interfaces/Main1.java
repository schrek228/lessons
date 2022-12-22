package lesson11_2_interfaces;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {

        //ОСОБЕННОСТИ ИНТЕРФЕЙСОВ:
        //Интерфейсы решают проблему множественного наследования: один класс может реализовывать бесконечное кол-во интерфейсов
        //К примеру в этой задаче класс Sphere реализует два интерфейса: Shape и Shape3D
        //1. все методы по дефолту public abstract
        //2. Все переменные в интерфейсе - public final static константы
        //3. От интерфейсов нельзя создать объект потому что они содержат абстрактные методы, у которых нет реализации
        //4. Интерфейсы также, как и обычные классы, поддерживают операции приведения типов:
//        Shape shape = new Rectangle(2,3);
//        Rectangle rec = (Rectangle)shape;
        //5. Интерфейсы могут содержать default методы (методы с реализацией). Данные методы будет наследоваться всеми классами

        ArrayList<Shape2D> list = new ArrayList<>();
        list.add(new Rectangle("green", 2, 3));
        list.add(new Sphere("red", 61));
        list.add(new Triangle("blue", 2, 3, 4));
        for (Shape2D shape2D : list) {
            System.out.println(shape2D.getSquare());
        }

        System.out.println("Вывести цвета только 2d фигур");
        for (Shape2D shape2D : list) {
            if (shape2D instanceof Shape2D ) {
                Shape sh = (Shape) shape2D;
                System.out.println(sh.color);
            }
        }
        System.out.println("Вывести цвета только 3d фигур");
        for (Shape2D shape2D : list) {
            if (shape2D instanceof Shape3D) {
                Shape sh = (Shape) shape2D;
                System.out.println(sh.color);
            }
        }


//        Shape shape = new Shape("red");// ошибка


    }
}

interface Shape2D {
    //final static
    double PI = 3.14; //просто пример final static константы

    double getSquare();

    double getPerimeter();

    //данный метод будет наследоваться всеми классами
    default void simpleMethod() {
        System.out.println("hello");
    }
}

interface Shape3D {
    double getVolume();
}

class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }
}

//Класс Triangle реализует (implements) интерфейс Shape
class Triangle extends Shape implements Shape2D {
    int a, b, c;

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getSquare() {
        return a * b * c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }


}

class Rectangle extends Shape implements Shape2D {
    int a;
    int b;

    public Rectangle(String color, int a, int b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    public double getSquare() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

}

class Sphere extends Shape implements Shape2D, Shape3D {
    int r;

    public Sphere(String color, int r) {
        super(color);
        this.r = r;
    }

    public double getSquare() {
        return 4 * Math.PI * r * r;
    }

    @Override
    public double getPerimeter() {
        return r * 3;
    }

    @Override
    public double getVolume() {
        return r * r * r;
    }
}