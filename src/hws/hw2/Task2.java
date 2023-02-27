package hws.hw2;

import java.util.Scanner;

public class Task2 {
    public static int intInput(String text){
        System.out.println(text);
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    public static void main(String[] args) {
        int select = 0;
        while(select!=6) {

            select = intInput("""
               
                                                1)Решение линейного уравнения
                                                2)Найти максимально число
                                                3)Вычисление Квадрата числа
                                                4)Решение квадратного уравнения
                                                5)Вычисление факториала
                                                6)Выход\\s
                                                """);
            Solution solution = new Solution();
            switch (select){
                case 1:{
                    System.out.println(solution.solute(intInput("a= "), intInput("b= "), intInput("c= ")));
                    break;
                }
                case 2:{

                    System.out.println(solution.max(intInput("a= "), intInput("b= ")));
                    break;
                }
                case 3:{
                    System.out.println(solution.quadrat(intInput("a= ")));
                    break;
                }
                case 4:{
                    solution.Quadratsolution(intInput("a= "), intInput("b= "), intInput("c= "));
                    break;
                }
                case 5:{
                    System.out.println(solution.factorial(intInput("a= ")));

                }
            }
        }
    }
}
class Solution{

    public double solute(int a,int b, int c){
        return (c-b)/a;
    }

    public int max(int a, int b){
        if (a>=b){
            return a;
        }
        else {
            return b;
        }
    }
    public int quadrat(int a){
        return a*a;
    }
    public void Quadratsolution(int a, int b, int c){
        int D= b*b-4*a*c;
        if(D<0){
            System.out.println("Дискриминант отрицательный, корней нет");
        }
        else {
            double x1 = -1 * b + Math.sqrt(D) / 2 * a;
            double x2 = -1 * b - Math.sqrt(D) / 2 * a;
            System.out.println("x1 = " + x1 + "\n" + "x2 = " + x2);
        }
    }
    public int factorial(int a){
        int factorial=1;
        for (int i = a; i > 0; i--) {
            factorial *=i;
        }
        return factorial;
    }

}