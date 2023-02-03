package com.abhi.Chapter11_20.Chapter19.SetClass;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {
    public static void main(String[] args) {
        int[] arr = {3,7,2,1,9,3,87,2,5,8};
        work(arr);
    }
    public static void work(int[] arr){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        System.out.println("Array");
        for (int x : arr){
            set.add(x);
            System.out.print(x +" ");
        }
        System.out.println("\nSet");
        for (int x : set){
            System.out.print(x + " ");
        }
        Integer[] i = new Integer[set.size()];
        i = set.toArray(i);
        System.out.println("\nInteger Object");
        for (int x : i ){
            System.out.print(x + " ");
        }
    }
}
