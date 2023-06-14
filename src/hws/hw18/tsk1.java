package hws.hw18;

import java.util.ArrayList;

public class tsk1 {
    public static void main(String[] args) {
        ArrayList<Planet> pList = new ArrayList();
        pList.add(new Planet("Jupiter",12.02));
        pList.add(new Planet("Earth",12.01));
        pList.add(new Planet("Saturn",25.2));
        pList.add(new Planet("Mercury",10.2));
        pList.add(new Planet("Mars",14.1));
        pList.add(new Planet("Venus",11));
        pList.sort(null);
        pList.stream().forEach(p-> System.out.println(p));






    }
}
class Planet implements Comparable<Planet>{
    String name;
    double D;

    public Planet(String name, double d) {
        this.name = name;
        D = d;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", D=" + D +
                '}';
    }

    @Override
    public int compareTo(Planet p) {
//        double result = D - p.D;
//        if(result<0) return -1;
//        else if(result>0) return 1;
//        return 0;

        //или так:
        return Double.compare(D, p.D);
    }
}
