package hws.hw16;

import java.util.List;

public class tsk3 {
    public static void main(String[] args) {
        List<Temperature> temps = List.of(new Temperature(16), new Temperature(123), new Temperature(-55));
        double reduce = temps.stream().mapToDouble(t -> t.midT).reduce(0, (sum, val) -> {
            sum += val;
            return sum;
        });
        System.out.println(" middle temp = "+reduce/temps.size());
    }
}
class Temperature{
    double midT;


    public Temperature(double midT) {
        this.midT = midT;
    }
}