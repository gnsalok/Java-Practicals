package com.company;

class ClassA extends Thread {
    public void run() {
        int[] intArray = new int[]{1, 2, 3, 4, 5};
        for (int i : intArray) {
            System.out.println(i);
        }
    }
}

class ClassB extends Thread {
    public void run() {
        String message = "This is the sample text!!";
        for (int i = 0; i < 10; i++) {
            System.out.println(message);
        }
    }
}

class ClassC extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(i);
            }

        }
    }
}

public class Main {

    public static void main(String[] args) {
        //it prints no. of values in the array
        ClassA threadA = new ClassA();
        threadA.start();

        //it shows the message 10 times
        ClassB threadB = new ClassB();
        threadB.start();

        //it shows the 1 to 10 integer values
        ClassC threadC = new ClassC();
        threadC.start();


    }
}
