package hws.hw3;
public class Task1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,6);
        rectangle.print();
        Rectangle rectangle1=new Rectangle(6,7,"red");
        rectangle1.print();
        Rectangle rectangle2=new Rectangle(8,9,"silver","metall");
        rectangle2.print();


    }
}
class Rectangle{
    int a,b;
    String color;
    String surface;
    public Rectangle(int a,int b){
        this.a=a;
        this.b=b;
    }
    public Rectangle(int a, int b, String color){
        this(a,b);
        this.color=color;
    }
    public Rectangle(int a, int b, String color,String surface){
        this(a,b,color);
        this.surface=surface;
    }
    public void print(){
        System.out.println(a+" "+b+" "+color+" "+surface);
    }
}