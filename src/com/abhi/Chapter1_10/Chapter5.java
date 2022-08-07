package com.abhi.Chapter1_10;

public class Chapter5 {
    public static void main(String[] args) {
        for (int i =0;i<10;i++){
            System.out.println("I: " + i);
            if (i==5){
                System.out.println("I is 5");
                break;
            }
        }
        int a =12;
        do {
            System.out.println("inside do");
            a--;
        }while (a>10);
        // ENHANCED FOR LOOP
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for (int x : arr){
            sum+=x;
            System.out.println("Value:" + x + " Sum: " + sum);
        }
    }
}
