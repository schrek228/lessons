package hws.hw1;

import java.util.Scanner;

public class Task2 {
    static int max_price=0;
    static int max_benefit=0;
    static String fructname;

    public static void main(String[] args) {
        Fruit[] fruitkit = new Fruit[5];
        int select=0;
        Scanner scan = new Scanner(System.in);
        /*while (index<5) {
            System.out.println("Введите название фрукта: ");
            fruct.name = scan.next();
            System.out.println("Введите стоимость фрукта: ");
            fruct.price = scan.nextInt();
            System.out.println("Введите пользу фрукта: ");
            fruct.benefit = scan.nextInt();
            while (fruct.benefit < 0 || fruct.benefit > 5) {
                System.out.println("Неверный ввод! Введите пользу фрукта еще раз: ");
                fruct.benefit = scan.nextInt();
            }
            fruitkit[index] = fruct;
            System.out.println(index);
            index+=1;
        }*/
        for (int i = 0; i < fruitkit.length; i++) {
            Fruit fruct = new Fruit();
            System.out.println("Введите название фрукта: ");
            fruct.name = scan.next();
            System.out.println("Введите стоимость фрукта: ");
            fruct.price = scan.nextInt();
            System.out.println("Введите пользу фрукта: ");
            fruct.benefit = scan.nextInt();
            while (fruct.benefit < 0 || fruct.benefit > 5) {
                System.out.println("Неверный ввод! Введите пользу фрукта еще раз: ");
                fruct.benefit = scan.nextInt();

            }
            fruitkit[i] = fruct;
            System.out.println(i);
            System.out.println(fruct.name +" "+ fruct.price + " " +fruct.benefit);
        }

        while(select!=7){
            System.out.println("""
                             1. Вывести все фрукты (всю информацию о каждом фрукте)
                             2. Вывести цену самого дорогого фрукта
                             3. Вывести название и цену фрукта под индексом
                             4. Вывести цену фрукта по названию
                             5. Найти сумму всех фруктов
                             6. Найти самый полезный фрукт (найти объект, который содержит данный фрукт и вывести его на консоль)
                             7. Выход""");
            select = scan.nextInt();
            switch (select){
                case(1):{
                    for (int i = 0; i < fruitkit.length; i++) {
                        fruitkit[i].print();
                    }
                    break;
                }
                case(2):{
                    for (int i = 0; i < fruitkit.length; i++) {
                        if(fruitkit[i].price>max_price){
                            max_price = fruitkit[i].price;
                            fructname=fruitkit[i].name;
                        }
                    }
                    System.out.println("Самый дорогой фрукт, "+ fructname + " стоит: "+ max_price);
                    break;
                }
                case (3):{
                    System.out.println("Введите номер фрукта(1-5)");
                    int index = scan.nextInt();
                    fruitkit[index-1].print();
                    break;
                }
                case (4):{
                    for (int i = 0; i < fruitkit.length; i++) {
                        System.out.println("Введите название фрукта");
                        String name = scan.next();
                        if(fruitkit[i].name.equals(name)){
                            System.out.println("Фрукт "+name+" стоит "+fruitkit[i].price);
                        }
                    }
                    break;
                }
                case(5):{
                    int sum = 0;
                    for (int i = 0; i < fruitkit.length; i++) {
                        sum+=fruitkit[i].price;
                    }
                    System.out.println(sum);
                    break;
                }
                case(6):{
                    for (int i = 0; i < fruitkit.length; i++) {
                        if(fruitkit[i].benefit>max_benefit){
                            max_benefit = fruitkit[i].benefit;
                            fructname=fruitkit[i].name;
                        }
                    }
                    System.out.println("Самый полезный фрукт, "+ fructname + ", его полезность: "+ max_benefit);
                    break;
                }
                case(7):{
                    break;
                }
            }
        }
        }
   }

class Fruit{
     int price;
     String name;
     int benefit;
    public String print(){
        return ("Название: "+ name + " Цена: " + price + " Польза: "+ benefit);
    }
}
