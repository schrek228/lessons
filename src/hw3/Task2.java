package hw3;

import java.util.Random;
import scn.MyScanner;

public class Task2 {

    public static void main(String[] args) {
        MyScanner scn = new MyScanner();
        int select=0;
        while(select!=3) {
            select=scn.nextInt("1)Стрельба в мишень"+"\n"+"2)Перестрелка двух челиков");
            switch (select){
                case 1:{
                    Shoter man = new Shoter();
                    man.shot(5);
                    break;
                }
                case 2:{
                    Character Steve = new Character("Steve", 10);
                    Character John = new Character("John",10);
                    while(Steve.HP>0&&John.HP>0){
                        System.out.println(Steve.shot(Steve,John));
                        if(Steve.HP==0){
                            System.out.println("Steve is dead, John win");
                            break;
                        }
                        if(John.HP==0){
                            System.out.println("John is dead, Steve win");
                            break;
                        }
                        System.out.println(John.shot(John,Steve));
                    }
                    break;
                }
            }

        }
    }
}
class Shoter{
    public static void main(String[] args) {

    }
    String weapon;
    MyScanner scn = new MyScanner();
    int rate=1;
    public void miss(){
        System.out.println("miss");
    }
    public  void htd(){
        System.out.println("hit the target");
    }
    public void boom(){
        System.out.println("BOOM");
    }
    public void shot(int rate){
        Random random = new Random();
        int goal = random.nextInt(0,2);
        boom();
        if(goal==1){
            htd();
            goal = random.nextInt(0,2);
            boom();
            if(goal==1){
                htd();
                for (int i = 0; i < rate; i++) {
                    goal = random.nextInt(0,2);
                    boom();
                    if(goal==1) {
                        htd();
                    }
                    else{
                        miss();
                    }
                }
            }
            else {
                miss();
            }
        }else {
            miss();
        }
    }
}
class Character{
    int HP=100;
    int damage;
    String name;
    int index=0;
    public Character(String name){
        this.name=name;
    }
    public Character(String name,int damage){
        this(name);
        this.damage=damage;
    }
    public int shot(Character s1,Character s2){
        Random rnd = new Random();

        System.out.println("Стреляет игрок "+s1.name);
        if(rnd.nextInt(0,2)==1){
            s2.HP-=s1.damage;
            index++;
            System.out.println("Урон: "+s1.damage+" здоровье игрока "+s2.name+": "+s2.HP+" попаданий:"+index);
        }
        else {
            System.out.println("промах" + " здоровье игрока " + s2.name + ": " + s2.HP+" попаданий:"+index);
        }
        return s2.HP;
    }
}