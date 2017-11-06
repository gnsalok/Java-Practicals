package com.company;

interface IDrawable {
    void draw();

    static int cube(int x) {
        return x * x * x;
    }
}

class Rectangle implements IDrawable {
    //Implementing the Interface method here...
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

public class Main {

    public static void main(String[] args) {

        Rectangle RR = new Rectangle();
        RR.draw();
        //Accessing the static method through the Interface
        int cubeRoot = IDrawable.cube(3);
        System.out.println("The cube root of 3 is " + cubeRoot);

    }
}
