package com.abhi.Chapter1_10.Chapter9;

public interface Coach {
    void pracitce();
    default void speak(){
        System.out.println("Coach speaking");
    }
    static int fee(){
        return 1000;
    }
}
