package lesson13_try_catch;

import scn.Input;

public class Main2 {
    public static void main(String[] args) {
        //Универсальный блок catch
        int a = Input.nextInt("Enter a: ");
        int b = Input.nextInt("Enter b: ");
        int[] arr = new int[2];
        try {
            System.out.println(a / b);
            System.out.println(arr[Input.nextInt("Enter index: ")]);
        }catch (Exception e){
            //выводит текст красным цветом без слова Exception
            e.printStackTrace();
        }


        System.out.println("finish");



    }

}
