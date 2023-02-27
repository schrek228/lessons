package hws.hw3;

public class Task3 {
    public static void main(String[] args) {
        MyMath mat = new MyMath();
        System.out.println(mat.power(2,10));
        System.out.println(mat.abs(-5));
    }
}
class MyMath{
    public double abs(double a){
        if(a<0){
            return a*(-1);
        }
        else{return a;
        }
    }
    public int abs(int a){
        return((int) abs((double) a));
    }
    public byte abs(byte a){
        return((byte) abs((double) a));
    }
    public short abs(short a){
        return((short) abs((double) a));
    }
    public int power(int val,int pow){
        int res=1;
        for (int i = 0; i < pow; i++) {
            res = res*val;
        }
        return res;
    }
    public double power(double val,int pow){
        double res=1;
        for (int i = 0; i < pow; i++) {
            res = res*val;
        }
        return res;
    }
    public byte power(byte val,int pow){
        byte res=1;
        for (int i = 0; i < pow; i++) {
            res = (byte) (res*val);
        }
        return res;
    }
    public long power(long val,int pow){
        long res=1;
        for (int i = 0; i < pow; i++) {
            res = res*val;
        }
        return res;
    }
}
