package lesson17_2_comparator;

public class Tovar {
    private String name;
    private int price;
    private int rating;

    public Tovar(String name, int price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }
}
