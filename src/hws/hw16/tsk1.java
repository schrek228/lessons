package hws.hw16;

import scn.MyScanner;

import java.util.ArrayList;

public class tsk1 {
    public static void main(String[] args) {
        MyScanner scn = new MyScanner();
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("King","Green mile"));
        books.add(new Book("King","11.22.63"));
        books.add(new Book("a","b"));
        books.add(new Book("a","c"));
        books.add(new Book("a","d"));
        String sAuthor = scn.next("");
        books.stream().filter(b->b.author.equals(sAuthor)).forEach(b-> System.out.println(b));

    }
}
class Book{
    String author;
    String name;

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Book(String author, String name) {
        this.author = author;
        this.name = name;

    }
}