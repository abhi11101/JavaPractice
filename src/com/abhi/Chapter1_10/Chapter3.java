package com.abhi.Chapter1_10;

public class Chapter3 {
    public static void main(String args[]){
        int I = 1;
        short S = 2;
        byte B = 3;
        long L = 4;
        float F = 5.6f;
        double D = 7.8;
        char C= 'A';
        int Hexa = 0x15;
        int bin = 0b1010;
        System.out.println("Integer " + I + "\n" + "Short: " + S + "\n" + "Byte " + B + "\n" + "Long " + L
        + "\n" + "Float" + F + "\n" + "Double " + D + "\n" + "char " + C +"\n" + "Hexa " + Hexa + "\n" +
                "Binary " + bin);
      // TYPE- CASTING
        I = S;
        System.out.println("Casting " + I);
    // ARRAYS

        int arr[] = new int[2];
        int array[] = {3,4};
        arr[0]= 1;
        arr[1] =2;
        System.out.println("Array first index: " + arr[0] + "\n" + "Second array memory: " +array);
    }
}
