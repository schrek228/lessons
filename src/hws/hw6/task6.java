package hws.hw6;

public class task6 {
    static int max = 0;
    static int index = 0;
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,10};
        System.out.println(findMax(arr));
    }
    public static int findMax(int[] ar){
        if(ar[index]>max){
            max=ar[index];
        }
        index++;
        if(index<ar.length) {
            findMax(ar);
        }
        return max;
    }
}
