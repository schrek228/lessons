package lesson17_2_comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main2_tovar {
    public static void main(String[] args) {
        //Создать класс Tovar без реализации сортировки через Comparable и реализовать два варианта сортировки через Comparator
        List<Tovar> tovars = new ArrayList<>(List.of(
                new Tovar("tovar1", 100, 3),
                new Tovar("tovar2", 90, 5),
                new Tovar("tovar3", 110, 5)
        ));
        System.out.println("Сортировка по убыванию рейтинга");
        Comparator<Tovar> sortByRatingDesc = (t1, t2)->t2.getRating() - t1.getRating();
        tovars.sort(sortByRatingDesc);
        tovars.forEach(t-> System.out.println(t));

        System.out.println("Сортировка по убыванию цены");
        Comparator<Tovar> sortByPriceDesc = (t1, t2)->t2.getPrice() - t1.getPrice();
        tovars.sort(sortByPriceDesc);
        tovars.forEach(t-> System.out.println(t));


        System.out.println("По убыванию рейтинга и убыванию цены");
        Comparator<Tovar> tovarComparator = sortByRatingDesc.thenComparing(sortByPriceDesc);
        tovars.sort(tovarComparator);
        tovars.forEach(t-> System.out.println(t));


    }
}
