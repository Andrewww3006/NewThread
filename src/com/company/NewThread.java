package com.company;

public class NewThread extends Thread{

    NewThread (String name){
        super(name);
    }



    public void run(){

        System.out.println(Thread.currentThread().getName() + " started");

        for (int i=0; i<100; i++)
            System.out.print("i_"+ i + ";");

        System.out.println();
        System.out.println(Thread.currentThread().getName() + " finished");

    }

}
