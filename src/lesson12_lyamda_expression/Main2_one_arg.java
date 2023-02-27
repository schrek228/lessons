package lesson12_lyamda_expression;

public class Main2_one_arg {
    public static void main(String[] args) {
        //Создать лямбду с одним параметром

        //Создать лямбду, которая проверяем число на четность

        //В случае с одним параметром круглые скобки можно не писать
        MyConsumerOneArg cons1 = a -> a % 2 == 0;
        System.out.println(cons1.test(20));
        System.out.println(cons1.test(21));

        //Создать лямбду, которая проверяем число Отрицательное
        MyConsumerOneArg cons2 = a -> a < 0;
        System.out.println(cons2.test(20));
        System.out.println(cons2.test(-21));


    }
}

interface MyConsumerOneArg {
    boolean test(int a);
}