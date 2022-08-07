package com.abhi.Chapter1_10.Chapter7;

public class Recursion {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.fact(3));
    }

}
class Factorial{
    int fact(int n){
        int res;
        if(n==1)return 1;
        res = n*fact((n-1));
        return res;
    }
}