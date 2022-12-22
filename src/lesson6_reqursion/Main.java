package lesson6_reqursion;

public class Main {
    public static void main(String[] args) {
        //Вывести на консоль 10 раз hello world с помощью рекурсии
//        task1(0);
        //Вывести на консоль числа от x до y
        //task2(2,20);

        //Вывести все символы строки по отедльности
        //task3("hello", 0);
        //Вывести все символы из строки в обратном порядке
        //task4("hello", 0);

        //вывести числа от n до 0
        //task5(10);

        //вывести числа от 0 до n
        //task6(10);

        //Найти сумму чисел от 1 до 5
        //System.out.println(task7(1));

        //Проверить, является ли число n степенью двойки или нет. Метод должен возвращать true/false

        //8 -> true (2^3)
        //6 -> false (2^?)
//        System.out.println(task8(8));
//        System.out.println(task8(6));
        System.out.println(task8(5));


    }

    public static boolean task8(double n){
        if(n == 2){
            return true;
        }
        else if(n<2){
            return false;
        }else{
            boolean res = task8(n/2);
            return res;
            //или так:
//            return task8(n/2);

        }
    }



    public static int task7(int val){
        if(val <= 5){
//            int sum = val + task7(val+1);
//            return sum;
            //или так:
            return val + task7(val+1);
        }
        return 0;
    }

    //1. 1 + task7(2)
    //2. 2 + task7(3)
    //3. 3 + task7(4)
    //4. 4 + task7(5)
    //5. 5 + task7(6)
    //6. 6 <= 5 -> false -> return 0

    //1. 1 + 14 -> 15
    //2. 2 + 12 -> 14
    //3. 3 + 9 -> 12
    //4. 4 + 5 -> 9
    //5. 5 + 0 -> 5
    //6. 6 <= 5 -> false




    public static void task6(int n) {
        if (n > 0) {
            task6(n-1);
            System.out.println(n);
        }
    }

    public static void task4(String str, int index) {
        if (index < str.length()) {
            task4(str, index + 1);
            System.out.print(str.charAt(index) + " ");

        }
    }

    public static void task3(String str, int index) {
        if (index < str.length()) {
            System.out.print(str.charAt(index) + " ");
            task3(str, index + 1);
            int val = 0;
        }
    }

    public static void task2(int x, int y) {
        if (x < y) {
            System.out.println(x);
            task2(x + 1, y);
        }
    }

    public static void task1(int count) {
        if (count < 10) {
            System.out.println(count + " hello world");
            task1(count + 1);
        }
    }


}

