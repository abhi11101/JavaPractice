package com.abhi.Chapter1_10.Chapter9;

public class InterfaceTest {
    public static void main(String[] args) {
        Coach c;
        Basketball basketball = new Basketball();
        Cricket cricket = new Cricket();
        System.out.println(Coach.fee());
        c = basketball;
        c.pracitce();
        c.speak();
        c =cricket;
        c.pracitce();
        c.speak();
    }
}
