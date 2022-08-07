package com.abhi.Chapter1_10.Chapter10;

public class ThrowTest {
    static void display(){
        try{
            throw new NullPointerException("Null Exc..");
        }catch (NullPointerException e){
            System.out.println("Exception caught from display");
            throw e;
        }finally {
            System.out.println("Finally from Display");
        }
    }

    public static void main(String[] args) {
        try {
            display();
        }catch (NullPointerException e){
            System.out.println("Caught form Main");
        }finally {
            System.out.println("Finally from main");
        }
    }
}
