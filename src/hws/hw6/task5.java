package hws.hw6;

public class task5 {
    static int sum = 0;
    static int index = 0;
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,10};
        System.out.println(sum(arr));
    }
    public static int sum(int[] ar){
        if(ar[index]%2==0){
            sum+=ar[index];
        }
        index++;
        if(index<ar.length) {
            sum(ar);
        }
        return sum;
    }
}
