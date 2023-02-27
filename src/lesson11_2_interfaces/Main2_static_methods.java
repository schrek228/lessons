package lesson11_2_interfaces;

import scn.Input;
import scn.MyScanner;

public class Main2_static_methods {
}

//Создать интерфейс для вычсления выражения a+b*PI
//значения переменных могут вводить как с консоли, так и рандомно
interface MyCalc{
    double PI = 3.14;

    //возведение а в степень b
    static int pow(int a, int b){
        int result = 1;
        for (int i = 0; i < b; i++) {
            result*=a;
        }
        return result;
    }

    default double calc(int a, int b){
        return getA()+getB()*PI;
    }

    int getA();
    int getB();

}

class ConsoleCalc implements MyCalc{

    @Override
    public int getA() {
        return Input.nextInt("Enter a: ");
    }

    @Override
    public int getB() {
        return Input.nextInt("Enter a: ");
    }
}