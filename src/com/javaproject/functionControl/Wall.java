package com.javaproject.functionControl;

public class Wall {
    private double width;
    private double height;

    public static void main(String[] args) {
        Wall wall= new Wall(5,4);
        wall.setHeight(-1.5);
        System.out.println("Width= " +  wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area = " + wall.getArea());
    }

    public Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }

    }

    public double getWidth() {
        if(width < 0){
            this.width= 0;
            return this.width;
        }
        else{
            return this.width;
        }
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        if (height < 0) {
            this.height = 0;
            return this.height;
        } else {
            return this.height;
        }
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        double area;
        area = this.width * this.height;
        return area;
    }
}
