package lesson2_2_constcturctors;

public class Main {
    public static void main(String[] args) {


        Rectangle rec = new Rectangle(2,3);
        Rectangle rec2 = new Rectangle(12, 31);
        Rectangle rec3 = new Rectangle(22, 23);
        rec.print();
        rec2.print();
        rec3.print();

        //Создать объект класса BankAccount
        BankAccount ba = new BankAccount(10, 1, 20);
        ba.print();




    }
}

//1. Констукрторы не имеют никакого типа возвращаемого значения
//2. Константы всегда имеют название такое же, как у класса
//3. Они автоматически вызываются при создании каждого объекта класса
class Rectangle {
    int a, b;

    //this - тот объект, у которого в данный момент вызывается метод или конструктор, с помощью this мы можем обратиться к объекту изнутри класса
    public Rectangle(int a, int b) {
        //System.out.println(a); //приоритет всегда отдается локальной переменной
        this.a = a;
        this.b = b;
    }

    public int getSquare() {
        return a * b;
    }

    public void print() {
        System.out.println("Стороны: " + this.a + ", " + this.b + ", square: " + getSquare());
    }

}


class BankAccount {
    int sum;
    int id;
    int yearPercent;

    public BankAccount(int sum, int id, int yearPercent) {
        this.sum = sum;
        this.id = id;
        this.yearPercent = yearPercent;
    }

    public void print() {
        System.out.println("Номер: " + id + "\nСумма на счету: " + sum + "\nПроцент на остаток: " + yearPercent);
    }

    public double getEarn() {
        return sum * yearPercent / 100;
    }
}
