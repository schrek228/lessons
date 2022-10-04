package lesson3_3_array_list;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ArrayList называет еще динамическим массивом
        //<> - diamond скобки
//        Integer i = 2; //boxing (упаковка числа в обертку: new Integer(2))
//        int b = i; //unboxing (распаковка числа из обертки)

//        Double d;
//        Float f;
//        Character c;
//        Long l;
//        Short sh;
//        Byte bb;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);


//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        System.out.println(list);

        boolean contains = list.contains(10); //проверяет на существование в списке
        System.out.println(contains);

        Integer val = 10;
        boolean remove = list.remove(val); //удаляет по значению и возвращает true/false
        System.out.println(remove);

        Integer remove1 = list.remove(0); //удаляет значение по индексу и возвращает удаленное значение
        System.out.println("Удалили число: "+remove1);
        System.out.println(list);

        int index = list.indexOf(30); //возвращает индекс искомого элемента, либо число -1, если элемент не найден
        if(index == -1){
            System.out.println("Элемент не найден");
        }else{
            System.out.println("Элемент найден, его индекс: "+index);
        }

        list.clear(); //очищает все элементы списка, size станет 0
        list.sort(null); //отсортирует все элементы по возрастанию


        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}
