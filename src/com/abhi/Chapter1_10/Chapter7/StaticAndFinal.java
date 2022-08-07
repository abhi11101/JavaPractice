package com.abhi.Chapter1_10.Chapter7;

public class StaticAndFinal {
    static int a =3;
    static int b;

    static{
        System.out.println("Static Block");
        b = 2;
    }
    static void meth(int x){
        System.out.println("X: " + x);
        System.out.println("A " + a);
        System.out.println("B " + b);
    }

    public static void main(String[] args) {
        meth(10);
        Test test = new Test();
        Test test1 = new Test();
        test.x = test.x+10;
        System.out.println("Y " + test.res(5));
        System.out.println("x " + test.x);
        test1.x = test1.x+20;
        System.out.println("X " + test1.x + " " + test.x);
        Test.meth();
    }
}

class Test{
static int x =100;
int y;
static void meth(){
    System.out.println("Static method of Test");
}
int res(int y){
    this.y =y;
    System.out.println("X " + x);
    return y;
}
}
