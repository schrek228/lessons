package hw10;

import scn.MyScanner;

import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {
        MyScanner scn = new MyScanner();
        ArrayList<Planet> planets = new ArrayList<>();
        ArrayList<Parcel> parcels =new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Parcel parc = new Parcel(scn.next("parcel content"));
            parcels.add(parc);
        }
        PlanetName[] names = PlanetName.values();
        for (int i = 0; i < names.length; i++) {
            Planet planet = new Planet(names[i],new ArrayList<>());
            planets.add(planet);
        }
        while(parcels.size()!=0){
            System.out.println("Cap, we have one parcel to deliver:"+parcels.get(0).content);
            String planName = scn.next("Where should we deliver it?");
            //TODO: для поиска нужной планеты вместо цикла можно использовать метод indexOf
            //Для этого нужно переопределить метод equals в классе Planet
            for (int i = 0; i < planets.size(); i++) {
                if (PlanetName.valueOf(planName.toUpperCase()).equals(planets.get(i).name)){
                    planets.get(i).update(parcels.get(0));
                    parcels.remove(0);
                }
            }

        }
        System.out.println("Our store is empty, lets get some beer and sleep? there is too many work for tomorrow");
    }
}
enum PlanetName {
    MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE;
}
class Parcel{
    String content;

    public Parcel(String content) {
        this.content = content;
    }
}
class Planet{
    PlanetName name;
    ArrayList<Parcel> parcelList;

    public Planet(PlanetName name,ArrayList<Parcel> parcelList) {
        this.name = name;
        this.parcelList = parcelList;
    }
    public ArrayList<Parcel> update(Parcel parcel){
        this.parcelList.add(parcel);
        return this.parcelList;
    }


}
