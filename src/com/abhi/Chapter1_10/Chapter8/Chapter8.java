package com.abhi.Chapter1_10.Chapter8;

public class Chapter8 {
    public static void main(String[] args) {
        Box box = new Box(5,6,7);
        BoxWeight boxWeight = new BoxWeight();
        System.out.println("Volume " + box.volume());
        System.out.println("Area " + boxWeight.area());
    }
}

class Box{
    int l,b,h;
    Box(){
        l=1;
        b=2;
        h=3;
        System.out.println("Box Default Const");
    }
    Box(int l,int b,int h){
        System.out.println("Box Parameterized Const");
        this.l =l;
        this.b =b;
        this.h =h;
    }
    int volume(){
        return l*b*h;
    }
}

class BoxWeight extends Box{
    int weight;
    BoxWeight(){
        super();
    }
    int area(){
        return l*b;
    }
}