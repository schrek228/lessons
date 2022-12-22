package hw3;
import scn.MyScanner;
import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyScanner scn = new MyScanner();
        ArrayList<Comment> list =new ArrayList<>();
        int select=0;
        while(select!=9){
            System.out.println("""
                    1. Добавить комментарий (пользователь вводит с консоли имя автора, текст)
                    2. Поставить лайк комментарию под индексом (пользователь вводит индекс комментария)
                    3. Поставить дизлайк под индексом
                    4. Очистить все нецензурные комментарии
                    5. Вывести все комментарии
                    6. Вывести текст и имя автора самого популярного комментария
                    7. Вывести текст и имя автора самого непопулярного комментария
                    8. Удалить комментарий автора (пользователь вводит имя автора. нужно не просто приравнять к null, а удалить его коммент из массива, но с сохранением размера самого массива)
                    9. Выход""");
            select=scan.nextInt();
            switch (select){
                case 1:{
                    Comment comment = new Comment(scan.next(), scan.next());
                    list.add(comment);
                    break;
                }
                case 2:{
                    int indexc=scn.nextInt("введите индекс");
                    list.get(indexc).addLike();
                    break;
                }
                case 3:{
                    int indexc=scn.nextInt("введите индекс");
                    list.get(indexc).addDislike();
                    break;
                }
                case 4:{
                    for (int i = 0; i < list.size(); i++) {
                        list.get(i).cleanNegativeText();
                        break;
                    }
                }
                case 5:{
                    System.out.println(list);
                }
                case 6:{

                }

            }
        }

    }
}

class Comment{
    String name;
    String text;
    int likes=0;
    int dislikes=0;
    public Comment(String name, String text){
        this.name=name;
        this.text=text;
    }
    public void cleanNegativeText(){
        if(text.equals("плохой комментарий")){
            this.text="";
        }
    }
    public void print(){
        System.out.println("Автор: "+name+"\n"+ text+"\n"+"+"+ likes+"\n"+"-"+dislikes);
    }
    public void addLike(){
        likes++;
    }
    public void addDislike(){
        dislikes--;
    }
}