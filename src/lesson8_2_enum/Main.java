package lesson8_2_enum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println(Week.MONDAY.russian);
        System.out.println(Week.MONDAY.name());  //name() всегда возвращает название константы в оригинальном виде. его нельзя переопределить, так как он final
        System.out.println(Week.MONDAY.toString());
        System.out.println(Week.TUESDAY.toString());
        Week week = Week.MONDAY;
        System.out.println(week);


        Scanner scn = new Scanner(System.in);
        System.out.print("Enter 1 for rus: ");
        int input = scn.nextInt();
        if(input == 1){
            Week.rus = true;
        }
        Day day1 = new Day(1, Week.MONDAY);
        Day day2 = new Day(2, Week.TUESDAY);
        System.out.println("Enter day of week");
        String weekDay = scn.next().toUpperCase();
        Week w = Week.myValueOf(weekDay);
        if(w==null){
            System.out.println("День недели не найден");
        }else {
            Day day3 = new Day(3, w);
            System.out.println(day3);
        }
        System.out.println(day1);
        System.out.println(day2);




    }
}

enum Week{
    MONDAY("ПОНЕДЕЛЬНИК"), TUESDAY("ВТОРНИК"), WEDNESDAY("СРЕДА"); //enum константы пишутся всегда большими буквами потому что это константы

    static boolean rus; //если true, используем русский язык в toString
    String russian;

    Week(String russian) {
        this.russian = russian;
    }

    @Override
    public String toString() {
        if(!rus){
            return name().toLowerCase(); //name() всегда возвращает название константы в оригинальном виде. его нельзя переопределить, так как он final
        }
        return russian.toLowerCase(); //name() всегда возвращает название константы в оригинальном виде. его нельзя переопределить, так как он final
    }

    public static Week myValueOf(String val){
        Week[] values = values(); //понедельник == monday
        for (Week week : values) {
            if(week.russian.equals(val) || week.name().equalsIgnoreCase(val)){
                return week;
            }
        }
        return null;
    }
}

class Day{
    int number;
    Week weekDay;

    public Day(int number, Week weekDay) {
        this.number = number;
        this.weekDay = weekDay;
    }

    @Override
    public String toString() {
        return "Day{" +
                "number=" + number +
                ", weekDay=" + weekDay +
                '}';
    }
}




