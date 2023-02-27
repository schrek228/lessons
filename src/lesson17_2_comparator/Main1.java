package lesson17_2_comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {


        List<Fruit> fruits = new ArrayList<>(List.of(
                new Fruit("apple", 20),
                new Fruit("qiwi", 10),
                new Fruit("apple", 10),
                new Fruit("apple", 15),
                new Fruit("orange", 2)));
        System.out.println("1. Сортировка по возрастанию цены");
        fruits.sort(null);
        fruits.forEach(t -> System.out.println(t));

        System.out.println("2. Сортировка по убыванию цены");
        Comparator<Fruit> sortByPriceDesc = (f1, f2)->f2.getPrice() - f1.getPrice();
        fruits.sort(sortByPriceDesc);
        fruits.forEach(t -> System.out.println(t));

        System.out.println("3. Сортировка по возрастанию алфавита");
        Comparator<Fruit> sortByNameAsc = (f1, f2)->f1.getName().compareTo(f2.getName());
        fruits.sort(sortByNameAsc);
        fruits.forEach(t -> System.out.println(t));

        System.out.println("4. Сортировка по возрастанию алфавита и по убыванию цены");
        Comparator<Fruit> fruitComparator = sortByNameAsc.thenComparing(sortByPriceDesc);
        fruits.sort(fruitComparator);
        fruits.forEach(t -> System.out.println(t));



    }
}
//Descending - по убыванию
//Ascending - по возрастанию
//class SortByPriceDesc implements Comparator<Fruit>{
//
//    @Override
//    public int compare(Fruit o1, Fruit o2) {
//        return o2.getPrice() - o1.getPrice();
//    }
//}


