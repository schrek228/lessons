package hws.hw4;


import java.util.ArrayList;

public class Task1 {
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> listIntersection = new ArrayList<>();
    static ArrayList<Integer> listUnion = new ArrayList<>();
    static ArrayList<Integer> listSubstract = new ArrayList<>();
    public static void main(String[] args) {
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(40);
        list.add(50);
        System.out.println(list);
        //list.remove(list.indexOf(10));
        list.remove(new Integer(10));
        System.out.println(list);
//        Collections.sort(list);
//        for (int i = 0; i < list.size()-1; i++) {
//            if(Objects.equals(list.get(i), list.get(i + 1))){
//                list.remove(i);
//                i--;
//            }
//        }
        //или так:
        for (int i = 0; i < list.size(); i++) {
            int val = list.get(i);
            if(list.indexOf(val) != list.lastIndexOf(val)){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);

        listUnion.add(10);
        listUnion.add(40);
        listUnion.add(50);
        listUnion.add(50);
        listUnion.add(110);
        listUnion.add(150);
        union(list,listUnion);
        System.out.println(list);
        listIntersection.add(20);
        listIntersection.add(30);
        listIntersection.add(40);
        listIntersection.add(50);
        listIntersection.add(100);
        listSubstract.add(30);
        listSubstract.add(40);
        listSubstract.add(100);
        intersection(list,listIntersection);
        System.out.println(listIntersection);
        System.out.println(list);
        substract(list,listSubstract);
        System.out.println(list);
    }
    public static void union(ArrayList<Integer> l1, ArrayList<Integer> l2){
        for (int i = 0; i < l2.size(); i++) {
            if(!l1.contains(l2.get(i))){
                l1.add(l2.get(i));
            }
        }
    }
    public static void intersection(ArrayList<Integer> l1, ArrayList<Integer> l2){

//        for (int i = 0; i < l1.size(); i++) {
//            if(!l2.contains(l1.get(i))){
//                l1.remove(l1.get(i));
//                i--;
//            }
//
//        }
        l1.retainAll(l2); //удаляет все элементы из l1, которых нет в l2
    }
    public static void substract(ArrayList<Integer> l1, ArrayList<Integer> l2){
        for (int i = 0; i < l1.size(); i++) {
            if(l2.contains(l1.get(i))){
                l1.remove(l1.get(i));
            }
        }
    }
}
