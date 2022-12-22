package scn;

import java.util.Objects;
import java.util.Scanner;

public class MyScanner {
    private Scanner scn = new Scanner(System.in);

    public int nextInt(String text) {
        System.out.print(text);
        int val = scn.nextInt();
        return val;
    }

    public String next(String text) {
        System.out.print(text);
        String val = scn.next();
        return val;
    }

    public int nextInt() {
        int val = scn.nextInt();
        return val;
    }
    public boolean nextBool(String text){
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
