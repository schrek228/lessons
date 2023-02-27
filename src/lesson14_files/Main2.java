package lesson14_files;

import scn.Input;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Artem\\IdeaProjects\\lessons\\src\\lesson14_files\\file1.csv";
        List<Fruit> list = readFromFile(filePath);
        int input = 0;
        while (input != 3) {
            System.out.println("1. Add fruit");
            System.out.println("2. Print all");
            System.out.println("3. Exit");
            input = Input.nextInt();
            switch (input) {
                case 1 -> list.add(new Fruit(Input.next("Enter fruit name: "), Input.nextInt("Enter price: ")));
                case 2 -> {
                    for (Fruit fruit : list) {
                        System.out.println(fruit);
                    }
                }
                case 3-> writeToFile(filePath, list);
            }
        }
    }
    static List<Fruit> readFromFile(String filePath){
        List<Fruit> list = new ArrayList<>();
        File file = new File(filePath);
        if(file.exists()) {
            try {
                Scanner scn = new Scanner(file);
                while (scn.hasNextLine()) {
                    String line = scn.nextLine();
                    String[] data = line.split(";");
                    list.add(new Fruit(data[0], Integer.parseInt(data[1])));
                }
                scn.close();
                System.out.println("File was uploaded");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    static void writeToFile(String filePath, List<Fruit> list){
        try {
            PrintWriter pw = new PrintWriter(filePath);
            for (Fruit fruit : list) {
                pw.println(fruit.getName()+";"+fruit.getPrice());
            }
            pw.close();
            System.out.println("File was saved");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}

class Fruit {
    private String name;
    private int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
