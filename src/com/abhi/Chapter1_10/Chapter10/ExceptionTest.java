package com.abhi.Chapter1_10.Chapter10;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            display();
        }catch (ArithmeticException e){
            System.out.println("Exception " + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception " + e);
        } finally{
            System.out.println("Finally called");
        }
    }
    static void display() throws ArithmeticException,ArrayIndexOutOfBoundsException{
        int a =10;
        int b=0;
        int c =a/b;
        int arr[] = {1,2};
        System.out.println("C " + c);
        System.out.println(arr[30]);
    }

}
