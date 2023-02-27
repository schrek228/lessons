package lesson13_try_catch;

import scn.Input;

public class Main3 {
    public static void main(String[] args) {
        //Самый лучший вариант обработки ошибки:

        //Если юзер делил на 0, вывести тест "На ноль делить нельзя"
        //Если юзер вышел за гринцы массива, вывести тест "Некорректный индекс"
        //Если произошла любая другая непредвиденная ошибкка, вывести текст "Неизвестная ошибка"
        int a = Input.nextInt("Enter a: ");
        int b = Input.nextInt("Enter b: ");
        int index = 0;
        int[] arr = new int[2];
        String str = null;
        try {
            System.out.println(a / b);
            index= Input.nextInt("Enter index: ");
            System.out.println(arr[index]);
            System.out.println("длина строки: "+str.length());
        }catch (ArithmeticException e){
            System.out.println("Нельзя делить на ноль");
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Некорректный индекс: "+index);
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Неизвестная ошибка");
            e.printStackTrace();
        }


        System.out.println("finish");



    }

}
