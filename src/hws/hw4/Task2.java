package hws.hw4;

import scn.MyScanner;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        MyScanner scn = new MyScanner();
        Gun g1 = new Gun("pistol",2,100);

        Gun g2 = new Gun("rifle",5,150);
        Gun g3 = new Gun("BFG",80,1500);
        Gun g4 = new Gun("toy", 0,1);
        Gun g5 = new Gun("Healer", -20,2000);
        ArrayList<Gun> guns = new ArrayList<>();
        guns.add(g1);
        guns.add(g2);
        guns.add(g3);
        guns.add(g4);
        guns.add(g5);
        System.out.println(guns.toString());
        Gun max = new Gun(null);
        for (int i = 0; i < guns.size(); i++) {
            if(guns.get(i).damage>max.damage){
//                max.damage = guns.get(i).damage;
//                max.name=guns.get(i).name;
//                max.price = guns.get(i).price;
                max = guns.get(i);
            }

        }
        System.out.println("most powerfull is: "+max.toString());
        String inputName = scn.next("Search: ");
        int index = guns.indexOf(new Gun(inputName));
        if(index == -1){
            System.out.println("not found");
        }else{
            System.out.println(guns.get(index));
        }
//        for (int i = 0; i < guns.size(); i++) {
//            if(guns.get(i).name.equals(inputName)){
//                System.out.println(guns.get(i).toString());
//            }
//
//        }
        String deleteName = scn.next("Search to delete: ");
        boolean remove = guns.remove(new Gun(deleteName));
        if(remove){
            System.out.println("deleted");
        }else{
            System.out.println("not deleted");
        }
//        for (int i = 0; i < guns.size(); i++) {
//            if (guns.get(i).name.equals(deleteName)) {
//                guns.remove(guns.get(i));
//                System.out.println(guns.toString());
//            }
//        }
    }
}
class Gun{
    String name;
    int damage;
    int price;
    public Gun(String name,int damage,int price){
        this(name);
        this.price=price;
        this.damage=damage;
    }

    public Gun(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o){
        Gun gun = (Gun) o;
        return name.equals(gun.name);
    }
    @Override
    public String toString(){
       return  "Weapon:"+" "+name + " has damage: "+" "+damage +" and that'll be $" + price;
    }


}