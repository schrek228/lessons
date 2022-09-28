package hw2;

import java.util.Random;
import java.util.Scanner;

public class Task0 {
    public static String stringInput(String text){
        Scanner scan = new Scanner(System.in);
        System.out.println(text);
        return scan.next();
    }
    public static int intInput(String text){
        System.out.println(text);
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    public static void main(String[] args) {
        int select = 0;
        Player[] database = new Player[10];
        int index=0;
        boolean isExist=false;
        while(select!=4){
            select = intInput("""
                    1. Регистрация
                    2. Вход
                    3. Вывести результаты
                    4. Выход""");
            switch (select){
                case(1):{

                    database[index] = new Player(stringInput("Введите имя: "), stringInput("Введите пароль: "));
                    for (int i = 0; i < index; i++) {
                        if(database[index].name.equals(database[i].name)){
                            System.out.println("такой аккаунт уже существует");
                            isExist = true;
                        }
                    }
                    if(!isExist) {
                        index++;
                        System.out.println(index);
                        for (int i = 0; i < index; i++) {
                            System.out.println(database[i].name + "  " + database[i].password + " " + database[i].record);
                        }

                    }
                    break;
                }
                case(2):{
                    int select1=0;
                    String name = stringInput("Введите логин: ");
                    String password = stringInput("Введите пароль: ");
                    for (int i = 0; i < index; i++){
                        if(name.equals(database[i].name)){
                            if(password.equals(database[i].password)) {
                                System.out.println("Добро пожаловать! ");
                                System.out.println("Ваш рекорд сейчас: " + database[i].record + " очков.");
                                while (select1 != 2) {
                                    select1 = intInput("1. Сыграть\n" +
                                            "2. Выйти в главное меню");
                                    if (select1 == 1) {
                                        Random rnd = new Random();
                                        int goal = rnd.nextInt(1, 6);
                                        System.out.println(goal);
                                        int answer = intInput("Введите ваше предположение(1-5)");
                                        if (goal == answer) {
                                            database[i].record += 1;
                                            System.out.println("Верно!");
                                        } else {
                                            System.out.println("Неверно((");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                case 3:{
                    for (int i = 0; i < index; i++) {
                        System.out.println(database[i].name +" : "+database[i].record);
                    }
                }
                case 4:{
                    break;
                }
            }
        }
    }
}
class Player{
    String name;
    String password;
    int record=0;
    public Player(String name, String password){
        this.name=name;
        this.password=password;
    }
}
