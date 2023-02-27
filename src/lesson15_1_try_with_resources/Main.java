package lesson15_1_try_with_resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //dosome();
        String filePath = "src\\lesson15_try_with_resources\\file.txt";
        //nio: Path, Files, FileWalker

        writeToFile2(filePath);
    }

    static void dosome(){
        try (Test test = new Test()){
            System.out.println("some action");
//            throw new Exception("OOPS!"); //не смотря на ошибку, метод close все равно сработает
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    static void readFromFile(String filePath){
        File file = new File(filePath);
        try (Scanner scn = new Scanner(file)){
            while(scn.hasNextLine()) {
                System.out.println(scn.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    static void writeToFile(String filePath){
        try (PrintWriter pw = new PrintWriter(filePath)){
            pw.println("hello world");
            pw.println(2345345);
            pw.println(2.5);
            pw.println(3.5);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void writeToFile2(String filePath){
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(filePath);
            pw.println("hello world");
            pw.println(2345345);
            pw.println(25);
            pw.println(287);
            pw.println(245);
            pw.println(2/0);
            pw.println(3.5);
        } catch (FileNotFoundException e) {
            pw.println("Record was aborted "+(2/0));
            e.printStackTrace();
        }finally {
            System.out.println("finally");
            if(pw!=null) {
                pw.close();
            }
        }
        System.out.println("continue");
    }
}

class Test implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("closed");
    }
}