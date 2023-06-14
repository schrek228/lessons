package lesson14_files;

import java.io.*;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        //Вывести цитату с ковычками на консоль: это можно сделать с помощью экранирующего символа \
        System.out.println("Цитата: \"Какая-то цитата\"");

        //Вывести на консоль сам экранирующий символ: надо этот символ заэкранировать им же самим
        System.out.println("symbol: \\");


        String filePath = "C:\\Users\\Artem\\IdeaProjects\\lessons\\src\\lesson14_files\\file1.csv";
        //writeToFile(filePath);
        readFromFile(filePath);
    }

    static void readFromFile(String filePath){
        File file = new File(filePath);
        Scanner scn = null;
        try {
            scn = new Scanner(file);
            while(scn.hasNextLine()) {
                System.out.println(scn.nextLine());
            }
            scn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    static void writeToFile(String file,String str){
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.println("hello world");
            pw.println(2345345);
            pw.println(2.5);
            pw.println(3.5);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
