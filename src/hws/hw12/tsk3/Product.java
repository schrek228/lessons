package hws.hw12.tsk3;

import java.time.LocalDate;

public class Product {
    private String name;
    private int price;
    private LocalDate date = LocalDate.now();

    public Product(String name,int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", date=" + date +
                '}';
    }
}
