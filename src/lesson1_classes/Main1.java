package lesson1_classes;

import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        //Создать массив из случ чисел в диапазоне от [10;30] и найти наибольшее
        Random rnd = new Random();
//        int val = rnd.nextInt(10, 30);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(10, 30);
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //ищем максимум
        //ищем минимум
        //сумма элементов
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
            sum+=arr[i];
        }
        System.out.println("max = "+max);
        System.out.println("min = "+min);
        System.out.println("sum = "+sum);

    }
}
