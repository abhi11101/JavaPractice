package com.abhi.Chapter11_20.Chapter19.SetClass;

import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        int[] arr = {9,2,6,3,4,6,1,7,-1};
        work(arr);
    }
    public static void work(int[] arr){
        TreeSet<Integer> set = new TreeSet<>();
        System.out.println("Array");
        for (int x : arr){
            set.add(x);
            System.out.print(x + " ");
        }
        System.out.println("\nSet");
        for (int x : set){
            System.out.print(x + " ");
        }
        System.out.println("\nHigher than 5");
        System.out.println(set.higher(5));
        System.out.println("Lower than 5\n" + set.lower(5));
        System.out.println("Ceiling\n" +set.ceiling(5));
    }
}
