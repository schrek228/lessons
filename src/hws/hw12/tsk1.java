package hws.hw12;

import scn.MyScanner;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class tsk1 {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        MyScanner scn = new MyScanner();
        Test test = () -> "my first lambda";
        System.out.println(test.doSome());
        Test test2 = () -> "hello " +scn.next("введите имя");
        System.out.println(test2.doSome());
        String filePath = "C:\\Users\\Artem\\IdeaProjects\\lessons\\src\\hws.hw12\\file1.txt";
        Test test3 = () -> {
            writeToFile(filePath, list);
            return "Data is written";
        };
        test3.doSome();

    }
    static void writeToFile(String filePath, ArrayList<String> list){
        try {
            PrintWriter pw = new PrintWriter(filePath);
            for (String line : list) {
                pw.println(line);
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
interface Test{
    String doSome();
}