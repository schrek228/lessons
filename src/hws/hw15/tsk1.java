package hws.hw15;

import java.util.ArrayList;

public class tsk1 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Kapital_Karl_Marx",5,300000000));
        books.add(new Book("Rich_dad_poor_dad",300,0));
        books.add(new Book("book",20,501));

        //TODO: переделать через стрим
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).price<50){
                System.out.println(books.get(i));
            }
            if(books.get(i).isBestseller()){
                System.out.println(books.get(i));
            }
        }

    }

}
class Book{
    String name;
    int price;
    int sales;
    public boolean isBestseller(){
        return sales > 100;
    }

    public Book(String name, int price, int sales) {
        this.name = name;
        this.price = price;
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", sales=" + sales +
                '}';
    }
}