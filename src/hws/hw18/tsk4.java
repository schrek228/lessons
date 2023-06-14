package hws.hw18;

import lesson17_2_comparator.Tovar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class tsk4 {
    public static void main(String[] args) {
        String file = "C:\\Users\\Artem\\IdeaProjects\\lessons\\src\\hws\\hw18\\names.txt";


        ArrayList<String> lines = readFile(file);
        System.out.println("1. Сортировка по алфавиту");
        lines.sort(null);
        lines.forEach(line -> System.out.println(line));

        System.out.println("2. Сортировка по слову");
        int index = 1;
        Comparator<String> sortByWord = (line1, line2) -> line1.split(" ")[index].compareTo(line2.split(" ")[index]);
        lines.sort(sortByWord);
        lines.forEach(line -> System.out.println(line));

        System.out.println("3. Сортировка по длине");
        Comparator<String> sortbylen = (line1, line2) -> line1.length() - line2.length();
        lines.sort(sortbylen);
        lines.forEach(line -> System.out.println(line));


    }

    static ArrayList<String> readFile(String filePath) {
        ArrayList<String> list = new ArrayList<>();
        File file = new File(filePath);

        Scanner scn = null;
        try {
            scn = new Scanner(file);
            while (scn.hasNextLine()) {
                list.add(scn.nextLine());
            }
            scn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }



}

