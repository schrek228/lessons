package lesson18_generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Shape shape;
        shape = new Rectangle(2,3);
        Rectangle rec = (Rectangle)shape;

        shape = new Square(2);


        Rectangle[] rectangles = {new Rectangle(2,3), new Rectangle(3,4)};
        Square[] squares = {new Square(2), new Square(3)};
        Shape[] shapes = rectangles; //ковариантность (когда то, что действует для обычного объекта, действует и на массив этих объектов)
        rectangles = (Rectangle[]) shapes; //контрвариантностью (обратное приведение)

        //таким образом можно создать универсапльный метод: передавать в него массив любых фигур и делать общие действия: вывести инфу и площадь
        printAllShapes(rectangles);
        System.out.println();
        printAllShapes(squares);


        //А РАСПРОСТРАНЯЮТСЯ ЛИ ЭТИ СВОЙСТВА НА СПИСКИ?
        List<Rectangle> rectangleList = List.of(new Rectangle(2,3), new Rectangle(3,4));
        List<Square> squareList = List.of(new Square(2), new Square(3));
        //List<Shape> shapeList = rectangleList; //по дефолту эти правила не распространяются, поэтому про списки говорят, что они ИНВАРИАНТНЫ
        //Инвариантность означает отсутствие свойст ковариантности и контрвариантности


        //HOW TO MAKE LISTS COVARIANT?
        //List<?> shapeList = rectangleList;
        //? - wildcard - по сути означает любой тип данных

        //Теперь списки ковариантны:
        List<? extends Shape> shapeList;
        shapeList = rectangleList;
        shapeList = squareList;
        //shapeList = new ArrayList<String>(); //нельзя записать то, что не является наследником
        Shape shape1 = shapeList.get(0); //тип данных не теряется
        System.out.println(shape1.getSquare()); //поэтому можно посчитать площадь
        //<? extends Shape> - означает, что тип данных может быть только тот, который явялется самим Shape или его наследником

        //<? super Square> - означает, что тип данных может быть только тот, который явялется самим Square или его родитилем
        //super позволяет добавлять в список объекты нижней границы


        //Проверить:
        printAllShapesFromList(rectangleList);
        rectangleList.add(new Square(2));
        System.out.println();
        printAllShapesFromList(squareList);


        addSquareToList(squareList);
        addSquareToList(rectangleList);
    }


    static void printAllShapesFromList(List<? extends Shape> shapes){
        shapes.stream().forEach(t-> System.out.println(t+", площадь: "+t.getSquare()));
    }
    static void addSquareToList(List<? super Square> shapes){
        shapes.add(new Square(2));
        //shapes.add(new Rectangle(2,3)); //error

    }



    static void printAllShapes(Shape[] shapes){
        Arrays.stream(shapes).forEach(t-> System.out.println(t+", площадь: "+t.getSquare()));
    }
}


abstract class Shape {
    abstract double getSquare();
}


class Rectangle extends Shape {

    int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getSquare() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

class Square extends Rectangle {

    public Square(int a) {
        super(a, a);
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" +a+
                '}';
    }
}




