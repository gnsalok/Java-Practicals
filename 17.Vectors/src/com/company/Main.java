package com.company;

import java.util.Enumeration;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Vector vec = new Vector(2);

        vec.addElement(22);
        vec.addElement(33);
        vec.addElement(44);
        vec.addElement(55);

        System.out.println("Size is: " + vec.size());
        System.out.println("Default capacity increment is: " + vec.capacity());

        vec.addElement(66);
        vec.addElement(77);
        vec.addElement(88);

        System.out.println("Size after addition: " + vec.size());
        System.out.println("Capacity after increment is: " + vec.capacity());

        Enumeration en = vec.elements();
        System.out.println("\nValues are:");
        while (en.hasMoreElements())
            System.out.print(en.nextElement() + " ");
    }

}