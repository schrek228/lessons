package lesson9_getclass_instanceof;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //INSTANCEOF
        //shape instanceof Circle дает true, если объект shape является объектом класса Circle или его наследником

        //GETCLASS
        // shape.getClass() == Circle.class дает true только, если переменная shape хранит объект класса Circle (наследники Circle эту проверку не пройдут)

//        - Создать суперкласс Shape и два подкласса: Круг и Прямоугольник. В мейне создать список ArrayList, заполнить его объектами.
        ArrayList<Shape> list= new ArrayList<>();
        list.add(new Rectangle(2,3));
        list.add(new Circle(3));
        list.add(new Rectangle(21,31));
        list.add(new Circle(31));
        list.add(new Sphere(61));

        System.out.println("1.  найти Circle с наибольшим радиусом");
        int max = 0;
        for (Shape shape : list) {
            //## Примеры getClass ##
//            Class clazz1 = shape.getClass();
//            Class clazz2 = Circle.class;
//            System.out.println(clazz1.getSimpleName()+" "+clazz2.getSimpleName()); //можно получить имя класса от объекта
            //##  ##
//            if(shape instanceof Circle) { //эта проверка здесь не подойдет из-за наследника Sphere
            if(shape.getClass() == Circle.class) {
                Circle circle = (Circle) shape;
                if (circle.r > max) {
                    max = circle.r;
                }
            }
        }
        System.out.println("max circle radius = "+max);
    }
}
class Shape{
    //создаем метод-пустнышку, чтобы в цикле в мейне можно было его вызвать, иначе он будет недоступен
    public double getSquare(){
        return 0;
    }
}

class Rectangle extends Shape {
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

class Circle extends Shape {
    int r;
    public Circle(int r) {
        this.r = r;
    }

    public double getSquare(){
        return Math.PI*r*r;
    }
}

class Sphere extends Circle {
    public Sphere(int r) {
        super(r);
    }

    public double getSquare(){
        return 4*super.getSquare();
    }
}


