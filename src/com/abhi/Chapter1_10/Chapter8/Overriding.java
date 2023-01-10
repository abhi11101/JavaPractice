package com.abhi.Chapter1_10.Chapter8;

public class Overriding {
    public static void main(String[] args) {
        C c = new C();
        D d = new D();
        E e = new E();
        c.display();
        d.display();
        c=d;
        c.display();
        c= e;
        c.display();


    }
}

class C{
    void display(){
        System.out.println("Class c display   ");
    }
}

class D extends C{
    void display(){
        System.out.println("Class D display");
    }
    void show(){
        System.out.println("D show");
    }
}

class E extends C{
    @Override
    void display() {
        System.out.println("Class E display");
    }

    void show(){
        System.out.println("E show");
    }
}