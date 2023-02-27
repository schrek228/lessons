package hws.hw11;

public class tsk2 {
    public static void main(String[] args) {

    }
}
abstract class Car{
    public abstract double gas();
    public abstract double showSpeed();

    public abstract int shiftUp();

    public abstract int shiftDown();
    public abstract int pushBreak();
    public abstract void engineStop();
    public abstract void engineCutOff();
    public abstract void engineStart();
    public abstract double engineAfterShiftUp();
    public abstract double engineAfterShiftDown();

    String name;
    int maxGear;
    int gear;
    int prevGear;
    double engineSpeed;
    double speed;

}
class ManualAuto extends Car{


    @Override
    public double gas() {
        switch (gear){
            case 0:{
                engineSpeed = engineSpeed+2000;
                break;
            }
            case(1):{
                engineSpeed = engineSpeed + 1200;
                break;
            }
            case(2):{
                engineSpeed =  engineSpeed + 1000;
                break;
            }
            case(3):{
                engineSpeed = engineSpeed + 800;
                break;
            }
            case(4):{
                engineSpeed = engineSpeed + 600;
                break;
            }
            case(5):{
                engineSpeed = engineSpeed + 500;
                break;
            }
        }
        return engineSpeed;
    }

    @Override
    public double showSpeed() {
        speed = engineSpeed * gear/100;
        return speed;
    }

    @Override
    public int shiftUp() {
        prevGear = gear;
        if(gear<5) {
            return gear + 1;
        }
        else{
            return gear;
        }

    }

    @Override
    public int shiftDown() {
        if(gear>0) {
            return gear - 1;
        }
        else{return gear;}
    }

    @Override
    public int pushBreak() {
        return 0;
    }

    @Override
    public void engineStop() {
        engineSpeed = 0;
        System.out.println("не бросай blj@d сцепление");
    }

    @Override
    public void engineCutOff() {
        System.out.println("Тачку убьешь, дебил");
    }

    @Override
    public void engineStart() {
        engineSpeed = 800;
    }

    @Override
    public double engineAfterShiftUp() {
        return engineSpeed * (1/gear);
    }

    @Override
    public double engineAfterShiftDown() {
        return engineSpeed / (1/gear);
    }
}
class AutoCar extends Car{

    @Override
    public double gas() {
        return 0;
    }

    @Override
    public double showSpeed() {
        return 0;
    }

    @Override
    public int shiftUp() {
        return 0;
    }

    @Override
    public int shiftDown() {
        return 0;
    }

    @Override
    public int pushBreak() {
        return 0;
    }

    @Override
    public void engineStop() {

    }

    @Override
    public void engineCutOff() {

    }

    @Override
    public void engineStart() {

    }

    @Override
    public double engineAfterShiftUp() {
        return 0;
    }

    @Override
    public double engineAfterShiftDown() {
        return 0;
    }
}
