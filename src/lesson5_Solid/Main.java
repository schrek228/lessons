package lesson5_Solid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //S - single responsibility (каждый класс должен отвечать только за самого себя)
        //Создать класс BlankCurrency (бумажная купюра) с полями номинал, тип (рубли, доллары...). Создать конструктор класса.
        //Создать класс CoinCurrency (монета) с полями номинал, тип. Создать конструктор класса.
        //Создать класс Wallet (кошелек) c полями blankCurrency и coinCurrency
        //Создать конструктор класса Wallet.
        //
        //
        //В мейне создать объект Wallet, проинициализировать его поля.
        //Вывести на консоль суммарную сумму в бумажнике.
        Wallet wallet = new Wallet(new Blank("RUB", 100), new Coin("USD", 50));
        System.out.println(wallet.getTotalSumInRub());
//        wallet.blank = null;

//        wallet.blank.value = -100;

        wallet.setBlank(new Blank("RUB", 500));
        wallet.getBlank().setValue(50);
        wallet.getBlank().setValue(wallet.getBlank().getValue()+100); //увеличить значение текущее на 100
        System.out.println(wallet.getTotalSumInRub());


    }
}
//Инкапсуляция - сокрытие неконтролируемого доступа к полям класса
//Класс Wallet инкапсулирует поля blank, coin
class Wallet{
    private Blank blank;
    private Coin coin;

    public Wallet(Blank blank, Coin coin) {
        this.blank = blank;
        this.coin = coin;
    }

    public void setBlank(Blank blank){
        if(blank!=null && blank.getValue() > 0) {
            this.blank = blank;
        }
    }

    public Blank getBlank() {
        return blank;
    }

    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin coin) {
        this.coin = coin;
    }

    //GOOD METHOD:
    public double getTotalSumInRub(){
        return blank.getSumInRub() + coin.getSumInRub();
    }
//BAD METHOD:
//    public double getTotalSumInRub(){
//        double sum =0;
//        if(blank.type.equals("USD")){
//            sum += blank.value * 60;
//        }
//        else if(blank.type.equals("EUR")){
//            sum += blank.value * 70;
//        }
//        else{
//            sum += blank.value;
//        }
//
//        if(coin.type.equals("USD")){
//            sum += coin.value * 60 / 100;
//        }
//        else if(coin.type.equals("EUR")){
//            sum += coin.value * 70 / 100;
//        }else{
//            sum += coin.value / 100;
//        }
//        return sum;
//    }
}

class Blank{
    private String type; //USD RUB EUR
    private double value;

    public Blank(String type, double value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        if(value>0) {
            this.value = value;
        }
    }

    public double getSumInRub(){
        if(type.equals("USD")){
            return value * 60;
        }
        else if(type.equals("EUR")){
            return value * 70;
        }
        else{
            return value;
        }
    }
}

class Coin{
    private String type; //USD RUB EUR
    private double value;

    public Coin(String type, double value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        if(value>0) {
            this.value = value;
        }
    }

    public double getSumInRub(){
        double sum = 0;
        if(type.equals("USD")){
            sum = value * 60;
        }
        else if(type.equals("EUR")){
            sum = value * 70;
        }else{
            sum = value;
        }
        return sum/100;
    }
}


