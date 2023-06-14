package hws.hw18;

import java.util.ArrayList;

public class tsk2 {
    public static void main(String[] args) {
        ArrayList<RealEstate> elist = new ArrayList<>();
        elist.add(new RealEstate(50,3,100));
        elist.add(new RealEstate(60,2,100));
        elist.add(new RealEstate(50,4,100));
        elist.sort(null);
        elist.stream().forEach(e-> System.out.println(e));
    }
}
class RealEstate implements Comparable<RealEstate>{

    private int square;
    private int rooms;
    private int price;





    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public RealEstate(int square, int rooms, int price) {

        this.square = square;
        this.rooms = rooms;
        this.price = price;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "square=" + square +
                ", rooms=" + rooms +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(RealEstate o) {
        int diff = price - o.price;
        if(diff==0) diff = o.square - square;
        if(diff==0) diff = o.rooms - rooms;
        return diff;

    }
}