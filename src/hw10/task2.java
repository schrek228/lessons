package hw10;

public class task2 {
    public static void main(String[] args) {

    }
}
class Fruit{
    String name;

    public Fruit(String name) {
        this.name = name;
    }
}
class Citrus extends Fruit{
    int sourness;

    public Citrus(String name, int sourness) {
        super(name);
        this.sourness = sourness;
    }
}
class Lemon extends Citrus{
    String color;
    public Lemon(String name, int sourness, String color) {
        super(name, sourness);
        this.color = color;
    }


}
class Apple extends Fruit{
    int ferrum;

    public Apple(String name, int ferrum) {
        super(name);
        this.ferrum = ferrum;
    }


}