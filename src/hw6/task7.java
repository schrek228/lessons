package hw6;

public class task7 {


    public static void main(String[] args) {

        System.out.println(fibo(10));
    }
    public static int fibo(int n){
        if(n >= 1 & n <= 2){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public void printfibo(int n){

    }
}


//|_||_||_||_||_|
//|_||P||_||_||_|
//|_||_||_||_||_|
//|*||*||*||_||_|
//|*||E||_||_||_|

