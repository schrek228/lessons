package lesson13_try_catch;

import scn.Input;

public class Main {
    public static void main(String[] args) {
        //Несколько блоков catch
        while (true) {


            int a = Input.nextInt("Enter a: ");
            int b = Input.nextInt("Enter b: ");
            int[] arr = new int[2];
            try {
                System.out.println(a / b);
                System.out.println(arr[Input.nextInt("Enter index: ")]);
            } catch (ArithmeticException e) {
                System.out.println("Нельзя делить на ноль");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("выход за границы массива");
            }

            System.out.println("finish");
        }



    }

}
