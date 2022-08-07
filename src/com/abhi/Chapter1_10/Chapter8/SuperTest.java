package com.abhi.Chapter1_10.Chapter8;

public class SuperTest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        B b1 = new B(2,3);

    }
}

class A{
    A(){
        System.out.println("A default");
    }
    A(int a, int b){
        System.out.println("A parameterized");
    }
}

class B extends A{
    B(){
        System.out.println("B default");
    }
    B(int a, int b){
        super(a,b);
        System.out.println("B parameterized");
    }
}
