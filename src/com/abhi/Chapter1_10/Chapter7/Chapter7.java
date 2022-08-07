package com.abhi.Chapter1_10.Chapter7;

public class Chapter7 {
    public static void main(String[] args) {
        Room room = new Room();
        Room room1 = new Room(5,6,7);
        Room room2 = new Room(room);
        System.out.println("Default Constructor: "+ room2.volume());
        room2 = new Room(room1);
        System.out.println("Parameterized Constructor: " + room2.volume());
    }
}

class Room{
    int l,b,h;
    Room(){
        l = 2;
        b =3;
        h =4;
    }
    Room(int l,int b, int h){
        this.l =l;
        this.b =b;
        this.h =h;
    }
    Room(Room room1){
        l = room1.l;
        b =room1.b;
        h = room1.h;
    }

    int volume(){
        return  l*b*h;
    }
}
