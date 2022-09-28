package lesson2_1_methods;

public class Main {
    public static void main(String[] args) {
        //Создать класс Calculator с полями a,b и методами суммы и разницы
        //public void sum()
        //public void sub()
        //
        //В мейне выполнить действия:
        //- сложить 2 и 3
        //- вычесть 10 и 5
        //- сложить 15 и 20
        //
        //Пользоваться данными методами не удобно, так как перед каждой операцией приходится выполнять присвоение значений a,b.
        //Изменить методы так, чтобы они принимали a,b через параметры и выполнить те же действия.
        Calculator calc = new Calculator();
        int res1 = calc.sum(2,3);
        System.out.println(res1*2);
    }
}

class Calculator{
    public int sum(int a, int b){
        return a+b;
    }

    public void minus(){
        System.out.println(2-3);
    }


}
