package hws.hw1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select = 0;
        int index = 0;
        Man[] pasports = new Man[10];
        while (select != 5) {

            System.out.println("""
                    1. Добавить паспорт (при условии, что серия и номер уникальны)
                    2. Вывести все паспорта (все элементы, кроме null)
                    3. Удалить паспорт (юзер вводит серию и номер)
                    4. Проверить паспорт на существование (юзер вводит серию и номер)
                    5. Выход""");
            select = scan.nextInt();
            switch (select) {
                case (1): {
                    boolean isExist = false;
                    Man man = new Man();
                    System.out.println("Введите серию паспорта: ");
                    man.series = scan.nextInt();
                    System.out.println("Введите номер паспорта: ");
                    man.number = scan.nextInt();
                    for (int i = 0; i < index; i++) {
                        if (man.number == pasports[i].number && man.series == pasports[i].series) {
                            isExist = true;
                        }
                    }
                    if (!isExist) {
                        System.out.println("Введите имя: ");
                        man.name = scan.next();
                        System.out.println("Введите фамилию: ");
                        man.surname = scan.next();
                        pasports[index] = man;
                        index++;
                    } else {
                        System.out.println("Паспорт уже существует");
                    }
                    System.out.println("index =" + index);
                    break;
                }
                case (2): {
                    for (int i = 0; i < index; i++) {
                        System.out.println(i + "Серия: " + pasports[i].series + " Номер: " + pasports[i].number + "\n"
                                + " Имя: " + pasports[i].name + " Фамилия: " + pasports[i].surname);
                        System.out.println("index =" + index);
                    }
                    break;
                }
                case 3: {
                    System.out.println("Серия паспорта: ");
                    int ser = scan.nextInt();
                    System.out.println("Номер паспорта: ");
                    int num = scan.nextInt();
                    boolean isExist = false;
                    for (int i = 0; i < index; i++) {
                        if (ser == pasports[i].series && num == pasports[i].number) {
                            pasports[i] = pasports[index - 1];
                            pasports[index - 1] = null;
                            index--;
                            System.out.println("Паспорт удален");
                            System.out.println("index =" + index);
                            isExist = true;
                        }
                    }
                    if (!isExist) {
                        System.out.println("Паспорта не существует");
                    }
                    break;
                }
                case (4): {
                    boolean isExist = false;
                    System.out.println("Серия паспорта: ");
                    int ser = scan.nextInt();
                    System.out.println("Номер паспорта: ");
                    int num = scan.nextInt();
                    for (int i = 0; i < index; i++) {
                        if (ser == pasports[i].series && num == pasports[i].number) {
                            System.out.println("Такой паспорт существует, на имя: " + pasports[i].name + " " + pasports[i].surname);
                            isExist = true;
                        }
                    }
                    if (!isExist) {
                        System.out.println("Паспорта не существует");
                    }
                    break;
                }
                default: {
                    System.out.println("Неверный ввод!");
                    break;
                }

            }

        }
    }
}

class Man {
    int series;
    int number;
    String name;
    String surname;
}
