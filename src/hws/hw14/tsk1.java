package hws.hw14;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class tsk1 {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\Artem\\IdeaProjects\\lessons\\src\\hws.hw14\\text.txt";
        ArrayList<Integer> list = new ArrayList<>();
        writeToFile(filepath);
        readFromFile(filepath,list);
        int sum = 0;
        int maxi = 0;
        int mini = 999999999;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>maxi){
                maxi = list.get(i);
            }
            if(list.get(i)<mini){
                mini = list.get(i);
            }
            sum+= list.get(i);
        }
        System.out.println("sum= "+sum+", max= "+maxi+", min= "+ mini);
    }
    static void readFromFile(String filePath,ArrayList<Integer> list){
        File file = new File(filePath);
        Scanner scn = null;
        try {
            scn = new Scanner(file);
            while(scn.hasNextLine()) {
                list.add(Integer.parseInt(scn.nextLine()));
            }
            scn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    static void writeToFile(String filePath){
        try {
            PrintWriter pw = new PrintWriter(filePath);
            for (int i = 0; i < 6; i++) {
                Random rnd = new Random();
                pw.println(rnd.nextInt(-10,10));
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
