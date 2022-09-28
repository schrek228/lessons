package lesson1_classes;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        //Написать программу - авторизацию по логину и паролю. Создать два массива: один хранит логин (arrLogins), другой - пароль(arrPasswords). Каждая пара логин-пароль находится на одинаковом индексе в обоих списках. То есть, к примеру, под индексом 0 в массиве arrLogins будет хранится логин пользователя, а его пара - пароль будет храниться под индексом 0, но уже в массиве arrPasswords.
        //
        //Создать консольное меню:
        //
//        1. Зарегистрироваться
//        2. Вход в систему
//        3. Удалить логин и пароль
//        4. Выход из аккаунта
//        5. Отобразить приватный текст, доступный только авторизованному пользователю
//        6. Выход
        //
        //При выборе пункта 1 программа запрашивает логин и пароль у пользователя для его регистрации и добавляет их в массивы, если их там еще нет. Если такая пара логин-пароль уже есть в массивах, программа выводит текст "Пара логин-пароль уже заняты".
        //
        //При выборе пункта 2 пользователь вводит логин и пароль для авторизации. Программа проверяет, что такая пара есть и в успешном случае выводит на консоль "Успешная авторизация", иначе "Неверный логин или пароль".
        //
        //При выборе пункта 3 программа завершает совю работу.

        System.out.println("hello world");

        Scanner scn = new Scanner(System.in);
        Account[] arr = new Account[10];
        Account account1 = new Account();
        account1.login = "a";
        account1.password = "b";
        Account account2 = new Account();
        account2.login = "x";
        account2.password = "y";
        arr[0] = account1;
        arr[1] = account2;


        //x
        int input = 0;
        int index = 2;
        String secrete_text = "I like python";
        int auth_index = -1;
        while (input != 6) {

            System.out.println("1. Зарегистрироваться\n" +
                    "2. Вход в систему\n" +
                    "3. Удалить логин и пароль\n" +
                    "4. Выход из аккаунта\n" +
                    "5. Отобразить приватный текст, доступный только авторизованному пользователю\n" +
                    "6. Выход");
            input = scn.nextInt();

            switch (input) {
                case 1: {
                    System.out.print("Enter login: ");
                    String login = scn.next();
                    //проверяем логин на дубликат
                    boolean isExist = false; //true, если логин занят
                    for (int i = 0; i < arr.length; i++) {
                        if (login.equals(arr[i].login)) {
                            System.out.println("Логин занят");
                            isExist = true;
                            break;
                        }
                    }
                    //если isExist осталась false после проверки на дубликат
                    if (!isExist) {
                        System.out.print("Enter password: ");
                        String password = scn.next();
                        Account ac1 = new Account();
                        ac1.login = login;
                        ac1.password = password;
                        arr[index] = ac1;
                        index++;
                    }
                    break;
                }
                case 2: {
                    //x y
                    //0: a b
                    //1: x y
                    //2: i j
                    //3:
                    System.out.print("Enter login: ");
                    String login = scn.next();
                    System.out.print("Enter password: ");
                    String password = scn.next();
                    boolean isExist = false;
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i]!=null && login.equals(arr[i].login) && password.equals(arr[i].password)) {
                            System.out.println("Welcome!");
                            isExist = true;
                            auth_index = i; //запоминаем индекс аккаунта
                            break;
                        }
                    }
                    if(!isExist){
                        System.out.println("Invalid login or password");
                    }

                    break;
                }
                case 3:{
                    if(auth_index!=-1){
                        arr[auth_index] = null;
                        System.out.println("Вы вышли из аккаунта");
                    }else{
                        System.out.println("Вы должны войти в аккаунт");
                    }
                }
                case 4:{
                    if(auth_index!=-1){
                        auth_index = -1;
                        System.out.println("Вы вышли из аккаунта");
                    }else{
                        System.out.println("Вы должны войти в аккаунт");
                    }
                    break;
                }
                case 5:{
                    if(auth_index!=-1){
                        System.out.println(secrete_text);
                    }else{
                        System.out.println("Вы должны войти в аккаунт");
                    }
                    break;
                }


            }
        }

    }
}

class Account {
    String login;
    String password;
}