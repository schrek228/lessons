package hws.hw16;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class tsk4 {
    public static void main(String[] args) {
        List<Integer> nums = new Random().ints(10, 2, 12).boxed().toList();
        String collect = nums.stream().map(t->String.valueOf(t)).collect(Collectors.joining(";"));
        System.out.println(collect);

    }
}

