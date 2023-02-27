package lesson12_lyamda_expression;

public class Main4_void {

    public static void main(String[] args) {
        //Создать void лямбду

        //1. Лямбда принимает строчку и вывести на консоль эту строчку 2 разa

        MyConsumerVoid cons1 = str -> System.out.println(str+str);
        cons1.consume("hello");


        //2. Лямбда принимает строчку и вывести на консоль эту строчку n раз
        int n = 3;
        MyConsumerVoid cons2 = str ->{
            for (int i = 0; i < n; i++) {
                System.out.print(str);
            }
            System.out.println();
        };

        cons2.consume("hello");
    }
}

interface MyConsumerVoid{
    void consume(String string);
}
