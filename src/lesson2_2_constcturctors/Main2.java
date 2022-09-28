package lesson2_2_constcturctors;


import scn.MyScanner;

public class Main2 {
    public static void main(String[] args) {
        //Создать класс Order (заказ блюда в кафе) с полями название блюда, цена, имя клиента
        //В классе создать конструктор, метод print.
        //В мейне создать массив заказов на 10 элементов.
        //
        //Создать коснольное меню:
        //
        //1. Добавить новый заказ
        //2. Вывести все заказы
        //3. Вывести заказы одного клиента
        //4. Вывести информацию о заказе под индексом
        //5. Вывести на консоль чек клиента (список блюд и итоговую стоимость)
        //6. Удалить из массива заказы клиента (удалить из массива с сохранением размера самого массива)
        //7. Выход

        MyScanner scn = new MyScanner();
        //Order order = new Order(scn.next("Enter dish name: "), scn.nextInt("Enter price: "), scn.next("Enter client: "));
        Order[] arr = new Order[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Order(scn.next("Enter dish name: "), scn.nextInt("Enter price: "), scn.next("Enter client: "));
        }


    }
}

class Order{
    String dishName;
    int price;
    String clientName;
    public Order(String dishName,int price, String clientName){
        this.dishName=dishName;
        this.price=price;
        this.clientName=clientName;
    }

}