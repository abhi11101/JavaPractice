package com.abhi.Chapter11_20.Chapter19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorTemp {
    public static void main(String[] args) {
            work();
    }

    public static void work(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1;i<=10;i++){
            list.add(i);
        }
     /*   Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        ListIterator<Integer> cycle = list.listIterator();
        while (cycle.hasNext()){
            System.out.println(cycle.next());
            cycle.add(-1);
        }
        System.out.println(list);
    }
}
