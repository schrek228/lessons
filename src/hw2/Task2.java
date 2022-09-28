package hw2;

import java.util.Scanner;

public class Task2 {
    public static int intInput(String text){
        System.out.println(text);
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    public static void main(String[] args) {
        Solution solution = new Solution(intInput("a= "),intInput("b= "),intInput("c= "));
        System.out.println(solution.solute(solution.a, solution.b, solution.c));
    }
}
class Solution{
    int a,b,c;
    public double solute(int a,int b, int c){
        return (c-b)/a;
    }
    public Solution(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
}