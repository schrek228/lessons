package lesson17_1_comparable;

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
//        if(price < o.price) return -1;
//        else if(price > o.price) return 1;
//        return 0;

        //или так:
        //return price - o.price; //сортировка по возрастанию цены
        //return o.price - price; //сортировка по убыванию цены
        //return name.compareTo(o.name); //сортировка по возрастанию алфавита
//        return o.name.compareTo(name); //сортировка по убыванию алфавита

        //сортировка по названию (по возрастанию) и по возврастанию цены
        int diff = name.compareTo(o.name);
        if (diff != 0) return diff;
        return price - o.price;
    }
}
