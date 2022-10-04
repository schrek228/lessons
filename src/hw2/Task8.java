package hw2;

import scn.MyScanner;

import java.util.Scanner;

public class Task8 {
    public static String stringInput(String text){
        Scanner scan = new Scanner(System.in);
        System.out.println(text);
        return scan.next();
    }
    public static int intInput(String text){
        System.out.println(text);
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    public static void main(String[] args) {
        Comment comments[] = new Comment[10];
        int select=0;
        int index=0;
        while(select!=9){
            select=intInput("""
                    1. Добавить комментарий (пользователь вводит с консоли имя автора, текст)
                    2. Поставить лайк комментарию под индексом (пользователь вводит индекс комментария)
                    3. Поставить дизлайк под индексом
                    4. Очистить все нецензурные комментарии
                    5. Вывести все комментарии
                    6. Вывести текст и имя автора самого популярного комментария
                    7. Вывести текст и имя автора самого непопулярного комментария
                    8. Удалить комментарий автора (пользователь вводит имя автора. нужно не просто приравнять к null, а удалить его коммент из массива, но с сохранением размера самого массива)
                    9. Выход""");
            switch (select){
                case 1:{
                    Comment comment = new Comment(stringInput("Введите имя: "),stringInput("Введите текст комментария: "));
                    comments[index]=comment;
                    index++;
                    break;
                }
                case 2:{
                    int indexc=intInput("введите индекс");
                     comments[indexc].addLike();
                     break;
                }
                case 3:{
                    int indexc=intInput("введите индекс");
                    comments[indexc].addDislike();
                    break;
                }
                case 4:{
                    for (int i = 0; i < index; i++) {
                        comments[i].cleanNegativeText(comments[i].text);
                        break;
                    }
                }
                case 5:{
                    for (int i = 0; i < index; i++) {
                        comments[i].print();
                    }
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
    public void cleanNegativeText(String text){
        if(text.equals("плохой комментарий")){
            text="";
        }
        System.out.println(text);
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