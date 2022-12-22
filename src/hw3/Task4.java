package hw3;

import scn.MyScanner;
import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        int select=0;
        MyScanner scn = new MyScanner();
        while (select!=7){
            select=scn.nextInt("""
                    1. Добавить строку в список
                    2. Вывести строки из списка
                    3. Удалить строку из списка (юзер вводит нужную строку с консоли)
                    4. Проверить строку на существование в списке
                    5. Получить индекс строки из списка
                    6. Отсортировать строки в списке (метод sort(null))
                    7. Выход
                    """);
            switch (select){
                case 1:{
                    list.add(scn.next("Ввод:"));
                    break;
                }
                case 2:{
                    for (String s : list) {
                        System.out.println(s);
                    }
                    break;
                }
                case 3:{
                    String search = scn.next("Ввод: ");
                    //list.remove(list.indexOf(search));
                    //или так:
                    list.remove(search);
                    break;
                }
                case 4:{
                    String search = scn.next("Ввод: ");
                    if(list.contains(search)){
                        System.out.println("строка есть");
                    }
                    else {
                        System.out.println("строки нет");
                    }
                    break;
                }
                case 5:{
                    String search = scn.next("Ввод: ");
                    System.out.println(list.indexOf(search));
                    break;
                }
                case 6:{
                    list.sort(null);
                    break;
                }
            }
        }
    }
}
