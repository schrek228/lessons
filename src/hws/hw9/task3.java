package hws.hw9;

import scn.MyScanner;

import java.util.ArrayList;
import java.util.Objects;


public class task3 {
    public static int select;
    static MyScanner scn = new MyScanner();
    public static void main(String[] args) {
        ArrayList<Rectangle> rects = new ArrayList<>();
        while(select!=4){

            System.out.println("""
                    1. Добавить фигуру (пользователь вводит с консоли стороны и цвет)
                    2. Вывести все фигуры определенного цвета (пользователь вводит цвет)
                    3. Проверить наличие фигуры в списке (пользователь вводит стороны фигуры и цвет. Две фигуры считаются равными, если совпадают стороны и цвет)
                    4. Выход""");
            select= scn.nextInt();
            switch (select){
                case(1):{
                    String scolor = scn.next("print a color").toUpperCase();
                    Rectangle rectangle = new Rectangle(Color.valueOf(scolor), scn.nextInt("print A"),scn.nextInt("print B"));
                    rects.add(rectangle);
                    break;

                }
                case(2):{
                    String scolor = scn.next("print a color");
                    Color clr = Color.valueOf(scolor);
                    for (int i = 0; i < rects.size(); i++) {
                        if(rects.get(i).getColor().equals(clr)){
                            System.out.println(rects.get(i).toString());
                        }
                    }
                    break;
                }
                case(3):{
                    String scolor = scn.next("print a color");
                    int sa = scn.nextInt();
                    int sb = scn.nextInt();
                    Rectangle et = new Rectangle(Color.valueOf(scolor),sa,sb);
                    if(rects.contains(et)){
                        System.out.println("exist");
                    }else{
                        System.out.println("not exist");
                    }
                    break;
                }
            }
        }
    }
}
enum Color{
    WHITE, BLUE, RED, GREEN;
        }
class Rectangle{
    private Color color;
    private int a,b;

    public Rectangle(Color color,int a,int b) {
        this.color = color;
        this.a=a;
        this.b=b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return a == rectangle.a && b == rectangle.b && color == rectangle.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, a, b);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color=" + color +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}