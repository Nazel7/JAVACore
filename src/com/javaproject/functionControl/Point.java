package com.javaproject.functionControl;

public class Point {
    public static void main(String[] args) {
        Point first= new Point(10, 5);
        Point point= new Point();
        point.distance(6,10);
        System.out.println("Distance1: "+ first.distance(point));
    }
    private int x;
    private int y;
    public Point(){
this(0, 0);
    }
    public Point(int x, int y){
        this.x= x;
        this.y= y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
return distance(0, 0);
    }
    public double distance(int x, int y){
double distance;
        distance= Math.sqrt((x- this.x )* (x- this.x)+ (y- this.y)* (y- this.y));
        return distance;
    }
    public double distance(Point another){
        int ano= another.x;
        int ano2= another.y;
        return distance(ano, ano2);
    }
}
