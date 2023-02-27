package hws.hw12.tsk3;

public class tsk3 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.add(new Product("beer",50));
        shop.add(new Product("Milk", 35));
        shop.add(new Product("cheese", 120));
        shop.add(new Product("Slave", 1200));
        shop.add(new Product("Ak-47",200));
        shop.add(new Product("pt", 1));
        System.out.println("first filter: ");


    }
}
