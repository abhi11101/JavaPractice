package com.abhi.Chapter11_20.Chapter19.ListClass;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        work(arr);
    }

    public static void work(int arr[]){
        ArrayList<Integer> list = new ArrayList<>();
        for (int x : arr){
            list.add(x);
        }
        System.out.println("List");
        for (int x : list){
            System.out.print(x + " ");
        }
        System.out.println();
        Object[] res = list.toArray();
        System.out.println("Object Array");
        for(Object x : res){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Integer Array");
        Integer[] ans = new Integer[list.size()];
        ans = list.toArray(ans);
        for (int x : ans){
            System.out.print(x+" ");
        }
        System.out.println("\nList Size " + list.size());
        System.out.println("List isEmpty " + list.isEmpty());
    }
}
