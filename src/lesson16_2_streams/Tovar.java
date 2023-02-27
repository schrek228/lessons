package lesson16_2_streams;

public class Tovar {
    String name;
    double price;

    public Tovar(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void increasePrice(double inflation){
        price += price * inflation / 100;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
