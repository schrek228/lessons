package hws.hw2;

import java.util.Scanner;

public class Task1 {
    public static int intInput(String text){
        System.out.println(text);
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    public static void main(String[] args) {
        int select=0;
            while (select!=8){

                select = intInput("""
                        1. Сложить (нужно считать два числа и вызвать метод sum)
                        2. Умножить (нужно считать два числа вызвать метод mult)
                        3. Делить (нужно считать два числа вызвать метод divide)
                        4. Вычесть (нужно считать два числа вызвать метод mult)
                        5. Наибольшее (нужно считать два числа вызвать метод greater)
                        6. Наименьшее (нужно считать два числа вызвать метод lesser)
                        7. Модуль (нужно считать одно число вызвать метод abs)
                        8. Выход""");
                Calculator calc = new Calculator();
                switch (select){
                    case 1:{

                        System.out.println(calc.sum(intInput("Введите первое число: "), intInput("Введите второе число: ")));
                        break;
                    }
                    case 2:{
                        System.out.println(calc.mult(intInput("Введите первое число: "), intInput("Введите второе число: ")));
                        break;
                    }
                    case 3:{
                        System.out.println(calc.devide(intInput("Введите первое число: "), intInput("Введите второе число: ")));
                        break;
                    }
                    case 4:{
                        System.out.println(calc.minus(intInput("Введите первое число: "), intInput("Введите второе число: ")));
                        break;
                    }
                    case 5:{
                        System.out.println(calc.greater(intInput("Введите первое число: "), intInput("Введите второе число: ")));
                        break;
                    }
                    case 6:{
                        System.out.println(calc.lesser(intInput("Введите первое число: "),intInput("Введите второе число: ")));
                        break;
                    }
                    case 7:{
                        System.out.println(calc.abs(intInput("Введите первое число: ")));
                        break;
                    }
                }
            }
    }
}
class Calculator{

    int sum(int a, int b){
        return a+b;
    }
    int minus(int a, int b){
        return a-b;
    }
    int mult(int a, int b){
        return a*b;
    }
    double devide(double a, double b){
        return a/b;
    }
    int greater(int a, int b){
        if(a>=b){
            return a;
        }
        else{return b;
        }

    }
    int lesser(int a, int b){
        if (a<=b){
            return a;
        }
        else {
            return b;
        }
    }
    int abs(int a){
        if (a<0){
            return a*(-1);
        }
        else {
            return a;
        }
    }

}
