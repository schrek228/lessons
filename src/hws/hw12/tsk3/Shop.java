package hws.hw12.tsk3;

import scn.MyScanner;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    MyScanner scn = new MyScanner();
    private List<Product> products = new ArrayList<>();
    public void add(Product product){
        products.add(product);
    }
    public void printAll(myFilter myFilter){
        for (int i = 0; i < products.size(); i++) {
            if(myFilter.filter(products.get(i))){
                System.out.println(products.get(i).toString());
            }
        }
    }
}
