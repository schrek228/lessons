package hw9;

public class task1 {
    public static void main(String[] args) {
        Animal[] zoo = new Animal[3];
        zoo[0]=new Dog("Shiba-inu","Momo");
        zoo[1]=new Cat("Oriental","Mario");
        zoo[2]=new Cow("Cow","Milka");
        for (int i = 0; i < zoo.length; i++) {
            System.out.println(zoo[i].getAnimalType());
            zoo[i].animalSay();
        }
    }
}
class Animal{
    private String animalType;
    private String name;

    public Animal(String animalType,String name) {
        this.animalType = animalType;
        this.name=name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void animalSay(){

    }
}
class Dog extends Animal{
    public Dog(String animalType, String name){
        super(animalType,name);
    }
    public void animalSay(){
        System.out.println("Гаф");
    }
}
class  Cat extends Animal{
    public Cat(String animalType, String name){
        super(animalType,name);
    }
    public void animalSay(){
        System.out.println("Мяу");
    }
}
class Cow extends Animal{
    public Cow(String animalType, String name){
        super(animalType,name);
    }
    public void animalSay(){
        System.out.println("Муу");
    }
}