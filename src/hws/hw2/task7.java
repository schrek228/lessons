package hws.hw2;

public class task7 {
    public static void main(String[] args) {

        Wallet wallet = new Wallet(100, "USD");
        System.out.println (wallet.convert(wallet.balance, wallet.type));

        Wallet wallet2 = new Wallet(150,"EUR");
        System.out.println(wallet.convert(wallet2.balance, wallet2.type));

        Wallet wallet3 = new Wallet(150, "RUB");
        System.out.println(wallet.convert(wallet3.balance, wallet3.type));


    }
}
class Wallet{
    double balance;
    String type; //Тип валюты (рубли, доллары...)
    public Wallet(double balance, String type){
        this.balance=balance;
        this.type=type;
    }
    public String convert(double balance,String type){

        double rub;
        if (type.equals("USD")) {
            rub = balance * 74;
        } else if (type.equals("EUR")) {
            rub = balance * 95;
        } else {
            rub = balance;
        }
        return ("В бумажнике " + rub + " руб.");
    }
}