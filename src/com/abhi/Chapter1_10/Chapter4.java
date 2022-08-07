package com.abhi.Chapter1_10;

public class Chapter4 {

    public static void main(String[] args) {
    int a = 10;
    int b =3;
        System.out.println("A " + a +"\n" + "B " + b);
        int c = ++a;
    int d = b++;
        System.out.println("A " + a +"\n" + "B " + b);
        System.out.println("Modulus: " + a%b);
        System.out.println("Prefix Increment: C= ++A " + c);
        System.out.println("Postfix increment: D= B++" + d);
    }
}
