package lesson17_2_comparator;

class Fruit implements Comparable<Fruit> {
    private String name;
    private int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(Fruit o) {
        return price - o.price; //сортировка по возрастанию цены
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
