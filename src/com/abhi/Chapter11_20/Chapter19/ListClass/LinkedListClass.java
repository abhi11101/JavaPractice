package com.abhi.Chapter11_20.Chapter19.ListClass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9};
        work(arr);
    }
    public static void work(int arr[]){
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        for (int x : arr){
            list.add(x);
            temp.add(x);
        }
        System.out.println("List");
        for (int x : list){
            System.out.print(x + " ");
        }
        list.addFirst(45);
        list.addLast(54);
        System.out.println("\nList");
            for (int x : list){
                System.out.print(x + " ");
        }
        list.addAll(temp);
        System.out.println("\nList");
        for (int x : list){
            System.out.print(x + " ");
        }
    }
}
