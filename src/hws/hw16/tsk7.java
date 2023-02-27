package hws.hw16;

import java.util.List;

public class tsk7 {
    public static void main(String[] args) {
        List<Frukt> frukts = List.of(new Frukt("a", 8),
                new Frukt("b", 2),
                new Frukt("c", 3));
         // Integer reduce = frukts.stream().map(t -> t.price).reduce(9999999, (val,min)-> {
         //   if (val < min) {
         //       min = val;
        //    }
        //    return min;
       // });
       // System.out.println(reduce);
        Frukt minfrukt = frukts.stream().reduce(new Frukt("max", 999999), (val, min) -> {
            if (val.price < min.price) {
                min = val;
            }
            return min;
        });
        System.out.println(minfrukt);
    }
}
class Frukt{
    String name;
    int price;

    public Frukt(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Frukt{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}