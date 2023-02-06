package com.abhi.Chapter11_20.Chapter19.MapClass;

import java.util.HashMap;
import java.util.Map;

public class HashMapTemp {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        work(arr);
    }

    public static void work(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            map.put(i,arr[i]);
        }
        for (Map.Entry<Integer,Integer> m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
