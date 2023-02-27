package hws.hw6;

public class task3 {
    public static void main(String[] args) {
        System.out.println(rekursFaktorial(6));
    }
    public static int rekursFaktorial(int n) {
        int fact=1;
        if (n > 1) {
            fact = n * rekursFaktorial(n - 1);
        }
        if (n <= 1) {
            fact = 1;
        }
        return fact;
    }
}
