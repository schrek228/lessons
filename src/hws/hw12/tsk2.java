package hws.hw12;

import scn.MyScanner;

public class tsk2 {
    public static void main(String[] args) {
        MyScanner scn = new MyScanner();
        int select = 0;

        myFunction summa = ((a, b) -> a+b);
        myFunction raznost = ((a, b) -> a-b);
        myFunction uravnenije = ((a, b) -> (3-b)/a);
        myFunction myMax = ((a, b) -> {
            if(a>=b){
                return a;}

            else return b;
        });
        while(select!=5){
            select = scn.nextInt("1. Найти сумму\n" +
                    "2. Найти разницу\n" +
                    "3. Найти корень\n" +
                    "4. Найти наибольшее\n" +
                    "5. Выход");
            switch (select){
                case 1:{
                    System.out.println(summa.doSome(scn.nextInt("a = "), scn.nextInt("b = ")));
                    break;
                }
                case 2:{
                    System.out.println(raznost.doSome(scn.nextInt("a = "), scn.nextInt("b = ")));
                    break;
                }
                case 3:{
                    System.out.println(uravnenije.doSome(scn.nextInt("a = "), scn.nextInt("b = ")));
                    break;
                }
                case 4:{
                    System.out.println(myMax.doSome(scn.nextInt("a = "), scn.nextInt("b = ")));
                    break;
                }

            }

        }
    }
}
interface myFunction{
    double doSome(double a, double b);
}