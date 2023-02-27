package hws.hw1;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int select = 0;
        int index = 0;
        Scanner scan = new Scanner(System.in);

        BankAccount[] database = new BankAccount[10];
        while (index < database.length) {
            BankAccount account = new BankAccount();
            Random rnd = new Random();
            account.sum = rnd.nextInt(0, 1000000);
            int id = rnd.nextInt(0, 100);
            if (index > 1) {
                for (int i = index - 1; i > 0; i--) {
                    if (id == database[i].id) {
                        id += 1;
                    }
                }
            }
            account.id = id;
            account.yearPercent = (rnd.nextInt(1, 10));
            database[index] = account;
            index++;
        }
        while (select != 6) {
            System.out.println("""
                    1. Вывести все счета
                    2. Вывести сумму на счете по номеру (юзер вводит номер)
                    3. Сделать перевод. Юзер вводит номер счета-отправителя, номер счета-получателя и сумму перевода. Сделайте проверку, что баланса отправителя хватает для перевода
                    4. Найти счет с самым большим процентом на остаток (найти целый объект)
                    5. Найти счет, владелец которого заработает больше всех процентов, если будет держать деньги на нем целый год. Прибыль за год вычисляется по формуле сумма на счету * процент на остаток / 100
                    6. Выход""");
            select = scan.nextInt();
            switch (select) {
                case (1): {
                    for (int i = 0; i < database.length; i++) {
                        database[i].print();
                    }
                    break;
                }
                case (2): {
                    System.out.println("Введите номер счета");
                    int num = scan.nextInt();
                    for (int i = 0; i < database.length; i++) {
                        if (num == database[i].id) {
                            System.out.println("Сумма на счете: " + database[i].sum);
                        }
                    }
                    break;
                }
                case (3): {
                    //1 5 3 8
                    System.out.println("Введите сумму перевода: ");
                    int value = scan.nextInt();
                    System.out.println("Введите номер счета-отправителя: ");
                    int id1 = scan.nextInt();
                    System.out.println("Введите номер счета-получателя: ");
                    int id2 = scan.nextInt();
                    int index1 = -1;
                    int index2 = -1;
                    for (int i = 0; i < database.length; i++) {
                        if (id1 == database[i].id) {
                            index1 = i;
                        }
                        if (id2 == database[i].id) {
                            index2 = i;
                        }
                    }
                    if (index1 == -1 || index2 == -1) {
                        System.out.println("Один из аккаунтов не найден");
                    } else {
                        if (value > database[index1].sum) {
                            System.out.println("Недостаточно средств!");
                        } else {
                            database[index1].sum -= value;
                            database[index2].sum += value;
                            System.out.println("Перевод успешен");

                        }
                    }
                    break;
                }
                case (4): {
                    BankAccount maxPercentAccount = database[0];
                    for (int i = 0; i < database.length; i++) {
                        if (maxPercentAccount.yearPercent < database[i].yearPercent) {
                            maxPercentAccount = database[i];
                        }
                    }
                    maxPercentAccount.print();
                    break;
                }
                case (5): {
                    double maxearn = 0;

                    for (int i = 0; i < database.length; i++) {
                        if (maxearn < database[i].earn()) {
                            maxearn = database[i].earn();

                        }
                    }
                    //System.out.println(BankAccount.print(database[i]));
                    return;
                }
                default: {
                    System.out.println("Неверный ввод! ");
                    break;
                }
            }
        }
    }
}

class BankAccount {
    int sum;
    int id;
    int yearPercent;

    public String print() {
        return ("Номер: " + id + "\nСумма на счету: " + sum + "\nПроцент на остаток: " + yearPercent);
    }

    public double earn(){
        return sum*yearPercent/100;
    }
}
