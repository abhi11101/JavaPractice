package com.abhi.Chapter1_10.Chapter8;

public class AbstractTest {
    public static void main(String[] args) {
        Figure f;
        Rectangle r = new Rectangle(2,3);
        f =r;
        System.out.println(f.area());
    }
}

abstract class Figure{
    int dim1;
    int dim2;
    Figure(int dim1, int dim2){
        this.dim1 =dim1;
        this.dim2 =dim2;
    }
    abstract int area();
}

class Rectangle extends  Figure{

    Rectangle(int a,int b){
        super(a,b);
    }
    @Override
    int area() {
        return dim1*dim2;
    }
}