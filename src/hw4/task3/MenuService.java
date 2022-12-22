package hw4.task3;

import scn.MyScanner;

import java.util.ArrayList;

public class MenuService {
    ArrayList<Cat> cats = new ArrayList<>();

    public void startMenu(){
        boolean select=true;
        int index=0;
        MyScanner scn = new MyScanner();
        Cat Dasha = new Cat("Dasha", "chockolate", 3);
        Cat Murzik = new Cat("Murzik","black",5);
        Cat Tishka = new Cat("Tishka","rust",4);
        Cat faggot = new Cat("faggot", "blue", 8);
        Cat asshole = new Cat("asshole", "brown", 9);
        cats.add(Dasha);
        cats.add(Murzik);
        cats.add(Tishka);
        cats.add(faggot);
        cats.add(asshole);

        print();
        System.out.println(findCat().mass);
        while (select) {
            select = scn.nextBool("устроим геноцид шерстяных??))");
            if (select) {
                catKiller();
                index++;
                switch (index) {
                    case 1: {
                        System.out.println("FIRST BLOAD!!!");
                        break;
                    }
                    case 2: {
                        System.out.println("DOUBLE KILL!!!");
                        break;
                    }
                    case 3: {
                        System.out.println("TRIPLE KILL!!!");
                        break;
                    }
                    case 4: {
                        System.out.println("RAMPAGE!!!!!");
                        break;
                    }
                    case 5: {
                        System.out.println("RAMPAGE!!!!");
                        break;
                    }
                }
            }
        }
        print();
    }
    public  void print() {
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i).toString());
        }
    }

    //TODO: заменить цикл на indexOf
    public  Cat findCat() {
        Cat cat = new Cat(null, null, 0);
        MyScanner scn = new MyScanner();
        String name = scn.next("введите имя кота ");
        String color = scn.next("введите цвет кота ");
        Cat standard = new Cat(name, color);
        for (int i = 0; i < cats.size(); i++) {
            if (standard.equals(cats.get(i))) {
                cat = (cats.get(i));
            } else {
                cat = null;
            }
        }
        return cat;
    }

    public  void catKiller() {
        Cat cat = findCat();
        cats.remove(cat);
    }
}
