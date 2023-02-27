package hws.hw14;

import scn.Input;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class tsk3 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Artem\\IdeaProjects\\lessons\\src\\hws.hw14\\records.txt";
        ArrayList<Man> recs = readFromFile(filePath);
        Random rnd = new Random();
        int f = 1;
        int s = 10;
        Man man = new Man(Input.next("name: "),0);
        while(true){
            int a = rnd.nextInt(f,s);
            int b = rnd.nextInt(f,s);
            System.out.println(a + " + " + b);
            int answer = Input.nextInt("your answer, write 0 to stop");
            if(answer!=0) {
                if (answer == a + b) {
                    f = f * 10;
                    s = s * 10;
                    man.record++;
                } else {
                    f = 1;
                    s = 10;
                    man.record = 0;
                }
            }else{
                recs.add(man);
                writeToFile(filePath,recs);
                break;
            }
        }
    }
    static ArrayList<Man> readFromFile(String filePath){
        ArrayList<Man> list = new ArrayList<>();
        File file = new File(filePath);
        if(file.exists()) {
            try {
                Scanner scn = new Scanner(file);
                while (scn.hasNextLine()) {
                    String line = scn.nextLine();
                    String[] data = line.split(";");
                    list.add(new Man(data[0], Integer.parseInt(data[1])));
                }
                scn.close();
                System.out.println("File was uploaded");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
    static void writeToFile(String filePath, List<Man> list){
        try {
            PrintWriter pw = new PrintWriter(filePath);
            for (Man man : list) {
                pw.println(man.getName()+";"+man.getRecord());
            }
            pw.close();
            System.out.println("File was saved");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class Man{
    String name;
    int record;

    public Man(String name, int record) {
        this.name = name;
        this.record = record;
    }

    public String getName() {
        return name;
    }

    public int getRecord() {
        return record;
    }
}