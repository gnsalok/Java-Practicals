package com.company;

public class Main {

    public static void main(String[] args) {

        String str= "Welcome to Java Geeks!!!    ";

        System.out.println("Index of G is: "+str.indexOf('G'));
        System.out.println("Index of t from 3: "+str.indexOf('t', 3));


        String subString="Java";
        System.out.println("index of substring Java :"+str.indexOf(subString));

        System.out.println("Char at 2 is:"+str.charAt(2));

        System.out.println("The lowercase strings are"+str.toLowerCase());
        System.out.println("The uppercase strings are"+str.toUpperCase());

        System.out.println("The length of string is: "+str.length());

        System.out.println("Replacing Java from java: "+str.replace('J','j'));

        System.out.println("Removing the whitespace: "+str.trim());

        int num = 35;
        String s1 = String.valueOf(num);
        System.out.println("Converting number into string"+s1);









    }
}
