package scn;

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


}
