package lesson12_lyamda_expression;

import java.util.ArrayList;

public class Main5_training {
    public static void main(String[] args) {
        Kinopoisk kinopoisk = new Kinopoisk();
        kinopoisk.add(new Film("film1", "director1", 2));
        kinopoisk.add(new Film("film2", "director1", 4.6));
        kinopoisk.add(new Film("film3", "director2", 3.1));
        kinopoisk.add(new Film("film4", "director2", 5));

        System.out.println("1. Print films of director1");
        kinopoisk.printAll(film -> film.director.equals("director1"));

        System.out.println("2. Print films with rating > 4");
        kinopoisk.printAll(film -> film.rating > 4);

        System.out.println("3. Print films of director1 with rating > 4");
        kinopoisk.printAll(film -> film.director.equals("director1") && film.rating > 4);

        System.out.println("4. Print all films");
        kinopoisk.printAll(null);


    }
}

interface MyPredicate {
    boolean test(Film film);
}

class Kinopoisk {
    private ArrayList<Film> films = new ArrayList<>();

    public void add(Film film) {
        films.add(film);
    }

    public void printAll(MyPredicate myPredicate) {
        if (myPredicate == null) {
            for (Film film : films) {
                System.out.println(film);
            }
        } else {
            for (Film film : films) {
                if (myPredicate.test(film)) {
                    System.out.println(film);
                }
            }
        }
    }


}

class Film {
    String name;
    String director;
    double rating;

    public Film(String name, String director, double rating) {
        this.name = name;
        this.director = director;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", rating=" + rating +
                '}';
    }
}