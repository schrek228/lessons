package lesson18_generics;



import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Дженерики (Generics) - классы с параметизированным типом данных T, например, ArrayList<T>


        //1. Создать класс, который сможет сохранять одно значение в любом типе данных
        Container<Integer> container = new Container<>(10);
        Container<Integer> container2 = new Container<>(20);
        Container<String> container3 = new Container<>("hello");
        Container<String> container4 = new Container<>("hello");


        System.out.println(container.val +container2.val);
        System.out.println(container3.val+container4.val);

        //2. Создать класс, который сможет хранить несколько параметизированных значений в разных типах данных
        //К примеру свяжем номер договора с ФИО его владельца
        ContainerTwoTypes<Integer, String> dogovors = new ContainerTwoTypes<>(12345, "Иванов Иван Иванович");
        System.out.println("number: "+dogovors.val1);
        System.out.println("fio: "+dogovors.val2);


    }
}
class Fruit{
    String name;
}
//ПРИМЕР ИСПОЛЬЗОВАНИЯ ДЖЕНЕРИКОВ ДЛЯ РЕАЛИЗАЦИИ ИНТЕРФЕЙСА ДЛЯ СОХРАНЕНИЯ В ФАЙЛ И ЗАГРУЗКИ ИЗ ФАЙЛА ЗНАЧЕНИЙ В РАЗНЫХ ТИПОВ ДАННЫХ
interface Data<T>{
    List<T> loadFromFile(String path);
    void saveToFile(List<T> data, String path);
}

class StringData implements Data<String>{

    @Override
    public List<String> loadFromFile(String path) {
        return null;
    }

    @Override
    public void saveToFile(List<String> data, String path) {

    }
}

class FruitData implements Data<Fruit>{

    @Override
    public List<Fruit> loadFromFile(String path) {
        return null;
    }

    @Override
    public void saveToFile(List<Fruit> data, String path) {

    }
}

class ContainerTwoTypes<T, E>{
    T val1;
    E val2;

    public ContainerTwoTypes(T val1, E val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public T getVal1() {
        return val1;
    }

    public void setVal1(T val1) {
        this.val1 = val1;
    }

    public E getVal2() {
        return val2;
    }

    public void setVal2(E val2) {
        this.val2 = val2;
    }
}

class Container<T>{
    T val;

    public Container(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }
}
