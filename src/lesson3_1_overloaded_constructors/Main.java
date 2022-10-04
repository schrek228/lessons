package lesson3_1_overloaded_constructors;

public class Main
{
    public static void main(String[] args) {

        //Перегруженные конструкторы, связанные по цепочке (chained overloaded constructors)
        //Перегрузку можно сделат, если:
        //1. Отличаются количеством параметров
        //2. Если кол-во совпадает, параметры должны отличаться типами данных
        //3. Если совпадает и кол-во и типы данных, параметры должны отличаться порядком следования, если это возможно

        //Создать форму регистрации на сайте. Для регистрации на сайте обычно есть обязательные поля для заполнения и не обязательные. Необходимо реализовать с применением конструкторов возможность регистрации несколькими вариантами, каждый из которых включает обязательные поля.
        //
        //Создать класс Registration с полями
        //логин
        //пароль
        //страна
        //город
        //возраст
        //
        //логин и пароль являются обязательными для заполнения, остальные нет
        //Создать перегруженные версии конструкторов
        //public Registration(String login, String password)
        //public Registration(String login, String password, String country)
        //public Registration(String login, String password, String country, String city)
        //public Registration(String login, String password, String country, String city, int age)
        //
        //Код внутри конструкторов не должен дублироваться, они должны быть связаны в цепочку.
        //
        //Создать метод print, который будет выводить значения полей.
        //
        //В мейне создать несколько объектов класса Registration, задействия все конструкторы и вывести информацию о них на консоль.

        Registration reg1 = new Registration("login1", "pass1");
        Registration reg2 = new Registration("login1", "pass1", "county1");
        Registration reg3 = new Registration("login1", "pass1", "county1", "city1");
        Registration reg4 = new Registration("login1", "pass1", "county1", "city1", 10);
    }
}

class Registration{
    String login;
    String password;
    String country;
    String city;
    int age;





    public Registration(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public Registration(String login, String password, String country) {
        this(login, password); //вызов другого констурктора должен быть первой строчкой в конструкторе
        this.country = country;
    }

    public Registration(String login, String password, String country, String city) {
        this(login, password, country);
        this.city = city;
    }



    public Registration(String login, String password, String country, String city, int age) {
        this(login, password, country, city);
        this.age = age;
    }

}
