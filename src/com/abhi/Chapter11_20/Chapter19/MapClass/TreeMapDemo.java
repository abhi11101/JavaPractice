package com.abhi.Chapter11_20.Chapter19.MapClass;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        int[] arr ={9,3,7,1,8,4,6,5};
        work(arr);
    }
    public static void work(int[] arr){
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for (int i=0; i<arr.length;i++){
            map.put(arr[i],i);
        }
        System.out.println("V I" );
        for (Map.Entry<Integer,Integer> m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
