package lesson12_lyamda_expression;

import scn.Input;

public class Main3_no_arg {
    public static void main(String[] args) {
        //Лямбда без параметров

        //Лямбда считывает с консоли имя юзера и возвращает строчку hello name
        MyConsumerNoArg cons = ()-> Input.next("your name") + " hello";
        System.out.println(cons.consume());
    }
}


interface MyConsumerNoArg{
    String consume();
}