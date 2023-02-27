package hws.hw6;

public class task4 {
    public static void main(String[] args) {
        System.out.println(reverseNumber("12345678", 0));
    }
    public static String reverseNumber(String n, int index){
        if(index<n.length()) {
            return reverseNumber(n, index + 1) + n.charAt(index);
        }else{
            return "";
        }
    }
//    public static void reverseNumber(String n, String res){
//        res = res + n.charAt(n.length()-1);
//        n=n.substring(0, n.length()-1);
//        if(n.length()==0){
//            System.out.println(res);
//        }
//        else{
//            reverseNumber(n,res);
//        }
//
//
//
//    }
}
