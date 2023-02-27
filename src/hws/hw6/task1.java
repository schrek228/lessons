package hws.hw6;

public class task1 {
    public static void main(String[] args) {
        task1 tsk = new task1();
        tsk.Every2ndChar("Hello world");
    }
    public void Every2ndChar(String str){
        System.out.println(str.charAt(0));
        if (str.length()>2) {
            Every2ndChar(str.substring(2));
        }
    }
}
