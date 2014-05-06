package com.company;

/**
 * Created by kacper on 5/6/14.
 */
public class Point {
    int x;
    int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
        System.out.println("Konstruktor");
    }
    Point(){
        this(0,0);
    }

}
