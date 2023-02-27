package hws.hw17;

import java.util.Arrays;
import java.util.Random;

public class tsk2 {
    public static void main(String[] args) {
        int[][] numbers = new int[5][5];
        Random rnd = new Random();
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                numbers[x][y]=rnd.nextInt(0,20);
            }
        }
        Arrays.stream(numbers).flatMapToInt(arr->Arrays.stream(arr)).forEach(t-> System.out.println(t));
    }
}
