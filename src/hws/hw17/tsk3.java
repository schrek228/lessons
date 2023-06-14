package hws.hw17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class tsk3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Bank[] banks = new Bank[10];

        for (int j = 0; j < 10; j++) {
            ArrayList<Deposit> deposits = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                Deposit dep = new Deposit(rnd.nextInt(1, 12), rnd.nextInt(1, 15));
                deposits.add(dep);
                banks[j]=new Bank(deposits);
            }

        }
        System.out.println(Arrays.toString(banks));
        List<List<Integer>> collect = Arrays.stream(banks).flatMap(arr -> Arrays.stream(banks)).map(t -> {
            return t.deps.stream().map(n -> n.percent).collect(Collectors.toList());
        }).collect(Collectors.toList());
        System.out.println(collect);

        //Вывод депозитов:
        Arrays.stream(banks).flatMap(bank -> bank.deps.stream()).forEach(dep-> System.out.println(dep));



    }
}
class Bank{
    List<Deposit> deps;

    @Override
    public String toString() {
        return "Bank{" +
                "deps=" + deps +
                "}\n";
    }

    public Bank(List<Deposit> deps) {
        this.deps = deps;

    }
}
class Deposit{
    int srok;
    int percent;

    @Override
    public String toString() {
        return "Deposit{" +
                "srok=" + srok +
                ", percent=" + percent +
                '}';
    }

    public Deposit(int srok, int percent) {
        this.srok = srok;
        this.percent = percent;
    }
}