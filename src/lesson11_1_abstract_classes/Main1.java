package lesson11_1_abstract_classes;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {

        //ОСОБЕННОСТИ АБСТРАКНЫХ КЛАССОВ:
        //1. Абстрактные классы могут содержать абстрактные методы
        //2. От абстрактных классов нельзя создать объект потому что они содержат абстрактные методы, у которых нет реализации
        //В остальном абстр. классы могут содержать такие же поля, конструкторы, методы как и обычные классы

        ArrayList<Shape> list= new ArrayList<>();
        list.add(new Rectangle("green", 2,3));
        list.add(new Circle("red", 3));
        list.add(new Sphere("blue", 61));
        list.add(new Triangle("red", 2,3,4));
        for (Shape shape : list) {
            System.out.println(shape.getSquare());
        }

//        Shape shape = new Shape("red");// ошибка



    }
}
abstract class Shape{
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getSquare();
    public abstract double getPerimeter();
    public abstract double getVolume();
}
class Triangle extends Shape{
    int a,b,c;

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getSquare() {
        return a*b*c;
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}
class Rectangle extends Shape {
    int a;
    int b;

    public Rectangle(String color, int a, int b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    public double getSquare(){
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }

    @Override
    public double getVolume() {
        return 0;
    }
}

class Circle extends Shape {
    int r;

    public Circle(String color, int r) {
        super(color);
        this.r = r;
    }

    public double getSquare(){
        return Math.PI*r*r;
    }

    @Override
    public double getPerimeter() {
        return r;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}
class Cub extends Rectangle{

    public Cub(String color, int a, int b) {
        super(color, a, b);
    }
}
class Sphere extends Circle {
    public Sphere(String color, int r) {
        super(color, r);
    }

    public double getSquare(){
        return 4*super.getSquare();
    }

    @Override
    public double getPerimeter() {
        return r*3;
    }

    @Override
    public double getVolume() {
        return r*r*r;
    }
}