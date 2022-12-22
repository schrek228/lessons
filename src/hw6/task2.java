package hw6;

public class task2 {
    public static void main(String[] args) {
        String[] arr = new String[]{"Eins","Zwei","Drei","Vier","Funf"};
        recursArrayPrinter(arr,0);
    }
     public static void recursArrayPrinter(String[] ar,int index){

         System.out.println(ar[index]);
         index++;
         if(index<ar.length) {
             recursArrayPrinter(ar,index);
         }
     }
}
