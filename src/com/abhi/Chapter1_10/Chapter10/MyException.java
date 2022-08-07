package com.abhi.Chapter1_10.Chapter10;

public class MyException {
    public static void main(String[] args) {
        try {
            display();
        }catch (demo e){
            System.out.println("Exception caught " + e);
        }
    }
    static void display() throws demo{
        System.out.println("Display");
        throw new demo();
    }
}
class demo extends Exception{
    public String toString(){
        return  "My Exception toString()";
    }
}
