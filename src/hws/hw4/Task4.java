package hws.hw4;

public class Task4 {
    public static void main(String[] args) {
        Calculator usu = new Calculator();
        CalculatorPro pro = new CalculatorPro();
        CalculatorEconomic economic = new CalculatorEconomic();
        System.out.println(usu.sum(5,6));
        System.out.println(pro.sum(5,946516));
        System.out.println(economic.minus(5,7));
        System.out.println(pro.mult(32,64));
        System.out.println(economic.convertRubToDollar(1000,0.65));
    }
}
class Calculator{
    public double sum(double a, double b){
        return a+b;
    }
    public double minus(double a, double b){
        return a-b;
    }
}
class CalculatorPro extends Calculator{
    public double mult(double a, double b){
        return a*b;
    }
    public double divide(double a, double b){
        return a/b;
    }
}
class CalculatorEconomic extends Calculator{
    public double convertRubToDollar(double rub, double course){
        return rub/course;
    }
}