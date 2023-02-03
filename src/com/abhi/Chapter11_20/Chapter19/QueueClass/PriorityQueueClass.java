package com.abhi.Chapter11_20.Chapter19.QueueClass;

import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        int[] arr = {9,2,6,3,4,6,1,7,-1};
        work(arr);
    }
    public static void work(int[] arr){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        System.out.println("Array");
        for (int x: arr){
            System.out.print(x +" ");
            queue.add(x);
        }
        System.out.println("\nQueue");
        for (int x: queue){
            System.out.print(x +" ");
        }
        System.out.println("\nPeek " + queue.peek() + " \nPoll " + queue.poll());
    }
}
