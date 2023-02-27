package hws.hw14;
import scn.Input;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class tsk2 {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\Artem\\IdeaProjects\\lessons\\src\\hws.hw14\\logpas.txt";
        ArrayList<Account> list = readFromFile(filepath);
        int input = 0;
        while (input != 3) {
            System.out.println("1. new account");
            System.out.println("2. login");
            System.out.println("3. Exit");
            input = Input.nextInt();
            switch (input) {
                case 1 -> list.add(new Account(Input.next("Enter login: "), Input.next("Enter password: ")));
                case 2 -> {
                    //TODO:  сделать без цикла
                    for (Account account : list) {
                        if(new Account(Input.next("Enter login: "),Input.next("Enter password")).equals(account)){
                            System.out.println("Success");
                            break;
                        }
                    }
                }
                case 3-> writeToFile(filepath, list);
            }
        }

    }
    static ArrayList<Account> readFromFile(String filePath){
        File file = new File(filePath);
        ArrayList<Account> list = new ArrayList<>();
        if(file.exists()) {
            try {
                Scanner scn = new Scanner(file);
                while (scn.hasNextLine()) {
                    String line = scn.nextLine();
                    String[] data = line.split(";");
                    list.add(new Account(data[0],data[1]));
                }
                scn.close();
                System.out.println("File was uploaded");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
    static void writeToFile(String filePath, ArrayList<Account> list){
        try {
            PrintWriter pw = new PrintWriter(filePath);
            for (Account account : list) {
                pw.println(account.getLogin()+";"+account.getPassword());
            }
            pw.close();
            System.out.println("File was saved");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


class Account{
    String login;
    String password;

    public Account(String login,String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(login, account.login) && Objects.equals(password, account.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}