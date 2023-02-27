package lesson13_try_catch;

import java.util.ArrayList;

public class Main4_throw {
    public static void main(String[] args) {
        //Зачем нужна генерация ошибки вручную с помощью слова throw?
        //1. генерация ошибка позволяет не писать return
        //2. генерация своих классов ошибок
//        MyArrayList list = new MyArrayList();
//        list.add(-100500);
//        System.out.println(list.get(-1));

        //рассмотрим второй случай
        Bank bank = new Bank();
        Card card1 = new Card("holder1", 1000);
        Card card2 =  new Card("holder2", 1000);
//        Card card2 = null;

        try {
            bank.withdraw(card1, card2, 10000);
        } catch (CardNotExistException e) {
            e.printStackTrace();
        }


    }
}

//2. генерация своих классов ошибок
class CardNotExistException extends Exception{

}
class HolderNotExistException extends RuntimeException{

}

class NotEnoughBalanceException extends RuntimeException{

    public NotEnoughBalanceException(String message){
        super(message); //передаем сообщение в родительский конструктор, чтобы оно выводилось на консоль
    }
}



class Bank{
    //Перевод с одной карты на другую
    public void withdraw(Card senderCard, Card receipCard, int sum) throws CardNotExistException{
        if(senderCard == null || receipCard == null){
            throw new CardNotExistException();
        }
        if(senderCard.holder == null || receipCard.holder == null){
            throw new HolderNotExistException();
        }
        if(senderCard.balance < sum){
            throw new NotEnoughBalanceException("На карте отправителя недостаточный баланс: "+senderCard.balance+", для отправки суммы: "+sum);
        }

        senderCard.balance-=sum;
        receipCard.balance+=sum;
        System.out.println("Перевод выполнен");
    }
}
class Card{
    String holder;
    int balance;

    public Card(String holder, int balance) {
        this.holder = holder;
        this.balance = balance;
    }
}

//1. генерация ошибка позволяет не писать return
class MyArrayList{
    int[] arr = new int[10];
    int index;
    public void add(int val){
        arr[index++] = val;
    }

    public int get(int index){
        if(index>=0 && index< arr.length) {
            return arr[index];
        }
        //генерация ошибка позволяет не писать return
        throw new IndexOutOfBoundsException("Выход индекса за границы массива: "+index);
    }

}
