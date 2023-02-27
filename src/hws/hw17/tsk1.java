package hws.hw17;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class tsk1 {
    public static void main(String[] args) {
        int[][] numbers = new int[5][5];
        Random rnd = new Random();
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                numbers[x][y]=rnd.nextInt(0,20);
            }
        }
        List<Integer> list = Arrays.stream(numbers).flatMapToInt(arr -> Arrays.stream(arr)).filter(t -> t < 5).boxed().collect(Collectors.toList());
        System.out.println(list);

    }
}

