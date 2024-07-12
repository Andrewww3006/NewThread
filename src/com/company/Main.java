package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Main Thread started");

        NewThread t = new NewThread("NewThread");
        t.start();
        try{
            t.join();
        } catch (InterruptedException e) {
            System.out.println(t.getName() + " has been interrupted");
        }
        System.out.println("Main Tread finished");
        System.out.println();

    }
}
