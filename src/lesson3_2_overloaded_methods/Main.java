package lesson3_2_overloaded_methods;

public class Main
{
    public static void main(String[] args) {
        //Перегрузку можно сделат, если:
        //1. Отличаются количеством параметров
        //2. Если кол-во совпадает, параметры должны отличаться типами данных
        //3. Если совпадает и кол-во и типы данных, параметры должны отличаться порядком следования, если это возможно
        //4. Бонус: у перегруженных методов может отличаться тип возвращаемого значение, но на саму перегрузку он никак не влияет


        //Создать класс Calculator с методом sum, который будет способен принимать параметры в разных типах:
        //
        //public int sum(int a, int b)
        //public int sum(String a, String b)
        //public int sum(int a, String b)
        //public int sum(String a, int b)
        //public double sum(double a, double b)

        Calculator calc = new Calculator();
        int a = 2;
        int b = 3;
        int sum = calc.sum(a, b);
    }
}

class Calculator{
    public int sum(int a, int b){
        return a+b;
    }

    public int sum(String a, String b){
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
    public int sum(int a, String b){
        return a + Integer.parseInt(b);
    }
    public int sum(String a, int b){
        return Integer.parseInt(a)  + b;
    }
    public double sum(double a, double b){
        return a+b;
    }
}