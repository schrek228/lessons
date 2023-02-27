package hws.hw17;

import scn.MyScanner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class tsk4 {
    public static void main(String[] args) {
        List<OnlineCinema> cinemaList = new ArrayList<>();
        List<Subscribe> sub = new ArrayList<>();
        sub.add(new Subscribe("basic","150",LocalDate.now()));
        sub.add(new Subscribe("plus","250",LocalDate.now()));

        cinemaList.add(new OnlineCinema("кинопоиск",sub));
        cinemaList.add(new OnlineCinema("netflix",sub));
        cinemaList.add(new OnlineCinema("ivi",sub));

        cinemaList.stream().forEach(t-> System.out.println(t.name));
//        String collect = cinemaList.stream().map(t -> t.subList.stream().map(n -> " subscribe 1: " + n.name + ", price: " +
//                n.price).collect(Collectors.joining("\n"))).collect(Collectors.joining("\n"));

        //2
        cinemaList.stream().flatMap(t -> t.subList.stream()).forEach(n -> System.out.println("subscribe 1: " + n.name + ", price: " + n.price));

        //TODO: доделать пункт 3

        //TODO: в задачии 4 измененная цена должна быть сохранена у подсписки
        String collect1 = cinemaList.stream().map(t -> t.subList.stream().map(n -> " subscribe 1: " + n.name + ", price: " +
                Double.parseDouble(n.price) * 1.1).collect(Collectors.joining("\n"))).collect(Collectors.joining("\n"));
        System.out.println("\n"+collect1);
        //5
        MyScanner scn = new MyScanner();
        String kino = scn.next("");
        //TODO: нужно сформировать не строк, а список объектов подписки
        String collect2 = cinemaList.stream().filter(n -> n.name.equals(kino)).map(t -> t.name + " " + t.subList.stream().map(k -> k.name).collect(Collectors.joining("\n"))).collect(Collectors.joining("\n"));
        System.out.println(collect2);
        //6
        //TODO: нужно сформировать не строк, а список объектов подписки
        int pr = scn.nextInt();
        String collect3 = cinemaList.stream().map(n -> n.subList.stream().filter(k -> Integer.parseInt(k.price) == pr).map(k -> k.name).collect(Collectors.joining("\n"))).collect(Collectors.joining("\n"));
        System.out.println(collect3);
    }
}
class Subscribe {
    String name; //название подписки
    String price; //цена подписки
    LocalDate date; //дата окончания подписки

    public Subscribe(String name, String price, LocalDate date) {
        this.name = name;
        this.price = price;
        this.date = date;
    }
}
class OnlineCinema{
    String name;
    List<Subscribe> subList = new ArrayList<>();

    public OnlineCinema(String name, List<Subscribe> subList) {
        this.name = name;
        this.subList = subList;
    }
//дальше ваша реализация
}