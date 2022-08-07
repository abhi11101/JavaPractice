package com.abhi.Chapter1_10;

public class Chapter6 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = box1;
        Box box4 = new Box(3,8);
        System.out.println("First objArea : " + box1.Area(2,4));
        System.out.println("Second obj area: " + box2.Area(5,7));
        System.out.println("Parameterized constructor: " + box4.c);
        box3.length =2;
        box3.height = 3;
        box3.breadth =4;
        System.out.println("Box 1: " + box1.volume() + "\n" + "Box 2: " + box2.volume() + "\n" + "Box 3: "+
                box3.volume());
    }
}

class Box{
    int length;
    int breadth;
    int height;
    int c;
    public Box(){

    }
    public Box(int a, int b){
        c = a*b;
    }
    public int Area(int length, int breadth){
        return  length*breadth;
    }
    public int volume(){
        return length*breadth*height;
    }
}
