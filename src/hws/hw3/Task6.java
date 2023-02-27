package hws.hw3;

import scn.MyScanner;

import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
        int select = 0;
        MyScanner scn = new MyScanner();
        ArrayList<CoffeePack> packlist = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            CoffeePack pack = new CoffeePack(scn.next("Введите сорт"), scn.nextInt("Введите массу"), scn.nextBool(""),scn.nextInt("Введите цену"));
            packlist.add(pack);
        }
        while (select!=10){
            select = scn.nextInt("""
                    1. Вывести все пачки кофе
                    2. Вывести пачки определенного сорта (юзер вводит сорт с консоли)
                    3. Вывести пачки определенного типа кофе (юзер вводит тип кофе с консоли)
                    4. Вывести пачки с весом в диапазоне x и y (юзер вводит x и y с консоли, программа выводит пачки с весом, входящим в диапазон от x до y)
                    5. Добавить в список новую пачку (при условии, что такой пачки еще нет в списке)
                    6. Узнать цену пачки (юзер вводит сорт, вес, тип кофе)
                    7. Узнать количество порций, на которое хватит одной пачки (юзер вводит сорт, вес, тип кофе. вам нужно получить объект пачки и потом у этого объекта можно будет вызвать метод convertToCaps)
                    8. Найти пачку с самым большим кол-вом порций
                    9. Найти пачку с самым маленьким весом
                    10. Выход""");
            switch (select){
                case 1:{
//                    for (int i = 0; i < ; i++) {
//
//                    }
                }
            }
        }
    }
}
class CoffeePack{
    String sort;
    int mass;
    boolean granulated;
    int price;
    public CoffeePack(String sort,int mass,boolean granulated,int price){
        this.sort=sort;
        this.mass=mass;
        this.granulated=granulated;
        this.price=price;
    }
    public int convertToCaps(int mass){
        return mass/10;
    }
}