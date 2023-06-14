package hws.hw18;

import java.util.ArrayList;
import java.util.Random;

public class tsk3 {
    public static void main(String[] args) {
        ArrayList<NewInt> ints = new ArrayList<>();
        Random rnd = new Random();
//        for (int i = 0; i < 50; i++) {
//            NewInt a = new NewInt(rnd.nextInt(0,1000));
//            ints.add(a);
//        }


        ints.add(new NewInt(1));
        ints.add(new NewInt(8));
        ints.add(new NewInt(4));
        ints.add(new NewInt(9));
        ints.add(new NewInt(5));
        ints.add(new NewInt(3));
        ints.add(new NewInt(2));
        ints.sort(null);
        ints.stream().forEach(i -> System.out.print(i + " "));
    }
}

class NewInt implements Comparable<NewInt> {
    int val;

    public NewInt(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }

    @Override
    public int compareTo(NewInt o) {
        //4 2
        //3 7
        //4 3
        //3 2
        if (val % 2 == 0 && o.val % 2 == 0) return val - o.val;
        else if (val % 2 != 0 && o.val % 2 != 0) return o.val - val;
        else if(val % 2 == 0) return -1;
        else return 1;
    }
}