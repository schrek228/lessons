package lesson8_1_polymofizm_super;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "Ivanov", 4.5);
        Student student2 = new Student("Ivan", "Ivanov", 4.5);
        System.out.println(student);
        Worker worker = new Worker("Ivan", "Semenov", "IT");
        Worker worker2 = new Worker("Ivan", "Semenov", "IT");
        System.out.println(worker);


        System.out.println(student.equals(student2));
        System.out.println(worker.equals(worker2));

        //ОПЕРАЦИИ ПРИВЕДЕНИЯ ТИПОВ (TYPE CASTING)
        Human h = student; //расширяющее приведение типов (up-casting)
        Student st = (Student)h; //сужающее приведение типов (down-casting)

        h = worker; //расширяющее приведение типов (up-casting)
        Worker w = (Worker) h; //сужающее приведение типов (down-casting)


        //Создать список всех людей
        ArrayList<Human> list = new ArrayList<>();
        list.add(student);
        list.add(worker);
        list.add(new Tutor("Ivan", "Igorev", "Java"));

        //Вывести информацию о каждом объекте на консоль через toString
        for (Human human : list) {
            System.out.println(human.toString()); //пример полиморфизма (когда одни метод работает по разному для каждого объекта)
        }






    }
}
class Human{
    String name;
    String lastname;


    public Human(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
    @Override
    public String toString() {
        return name+" "+lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(lastname, human.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname);
    }
}
class Student extends Human{

    double avg;

    public Student(String name, String lastname, double avg){
        super(name, lastname); //вызыываем конструктор родительского класса, должно быть на первом месте
        this.avg = avg;
    }

    @Override
    public String toString() {
        return super.toString()+" "+avg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return super.equals(student) && Double.compare(student.avg, avg) == 0;
    }


}

class Worker extends Human{

    String profession;
    public Worker(String name, String lastname,String profession){
        super(name,lastname);
        this.profession = profession;
    }
    @Override
    public String toString() {
        return super.toString()+" "+profession;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return super.equals(o) &&  Objects.equals(profession, worker.profession);
    }


}

class Tutor extends Human{

    String language;

    public Tutor(String name, String lastname, String language) {
        super(name, lastname);
        this.language = language;
    }
    @Override
    public String toString() {
        return super.toString()+" "+language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tutor tutor = (Tutor) o;
        return super.equals(o) && Objects.equals(language, tutor.language);
    }


}



