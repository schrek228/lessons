package scn;

import java.util.Objects;
import java.util.Scanner;

public class Input {


    public static int nextInt() {
        Scanner scn = new Scanner(System.in);
        int val = scn.nextInt();
        return val;
    }
    public static int nextInt(String text) {
        System.out.print(text);
        return nextInt();
    }

    public static String next(String text) {
        Scanner scn = new Scanner(System.in);
        System.out.print(text);
        String val = scn.next();
        return val;
    }


    public boolean nextBool(String text){
        Scanner scn = new Scanner(System.in);
        System.out.println(text);
        String val = scn.next();
        if(Objects.equals(val, "yes")){
            return true;
        }
        else{
            return false;
        }
    }

}
