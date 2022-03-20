package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
        Generics метод тузунуз.Параметрине generic тибиндеги массивди алсын.
        Ал метод биринчи массивдин биринчи жана акыркы элементтерин консолго чыгарсын,
         анан бардык элементтерин чыгарсын.
         */

        ArrayList <Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(5);
        integerArrayList.add(6);
        integerArrayList.add(7);
        integerArrayList.add(8);

        genericMethod(integerArrayList);
        genericMethodWithWildCard(integerArrayList);

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Hello");
        stringArrayList.add("World");
        stringArrayList.add("Java");
        stringArrayList.add("Rules");

        genericMethod(stringArrayList);
        genericMethodWithWildCard(stringArrayList);

    }

    public static <T> void genericMethod(ArrayList<T> arrayList){
        System.out.println("First element of arraylist: "+arrayList.get(0));
        System.out.println("Last element of arraylist: "+arrayList.get(arrayList.size()-1));

        for (T t : arrayList) {
            System.out.println(t);
        }
    }

    public static void genericMethodWithWildCard(ArrayList<?> arrayList){
        System.out.println("First element of arraylist: "+arrayList.get(0));
        System.out.println("Last element of arraylist: "+arrayList.get(arrayList.size()-1));

        for (Object o : arrayList) {
            System.out.println(o);
        }
    }
}

