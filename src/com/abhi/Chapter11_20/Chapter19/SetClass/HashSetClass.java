package com.abhi.Chapter11_20.Chapter19.SetClass;

import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {
        int[] arr = {9,2,6,3,4,6,1,7,-1};
        work(arr);
    }

    public static void work(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Array");
        for (int x : arr){
            set.add(x);
            System.out.print(x + " ");
        }
        System.out.println("\nSet");
        for (int x : set){
            System.out.print(x + " ");

        }
    }
}
