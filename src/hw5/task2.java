package hw5;

import scn.MyScanner;

import java.util.Random;

public class task2 {

    public static void main(String[] args) {
        MyScanner scn =new MyScanner();
        Pen pen = new Pen(new Solid("black",100));
        while(pen.getSolid().getVolume()>0){
            pen.write("some text");
        }
        pen.setSolid(new Solid(scn.next("input solids color"),100));
        while(pen.getSolid().getVolume()!=0){
            pen.write("some text");
        }
    }
}
class Solid{
    private String color;
    private int volume;

    public Solid(String color, int volume) {
        this.color = color;
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public int getVolume() {
        return volume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
class Pen{
    private Solid solid;

    public Pen(Solid solid) {
        this.solid = solid;
    }

    public void setSolid(Solid solid) {
        this.solid = solid;
    }

    public Solid getSolid() {
        return solid;
    }

    Random rnd = new Random();
    public void write(String text) {
        if (solid.getVolume() == 0) {
            System.out.println("недостаточно чернил");
        } else {
            System.out.println(text + '(' + solid.getColor() + ')');
            solid.setVolume(solid.getVolume() - rnd.nextInt(10, 21));
            if (solid.getVolume() < 0) {
                solid.setVolume(0);
            }
        }
    }
}