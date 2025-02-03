package com.selfpractice;

public class Lamda {



        static Runnable r = new Runnable() {

            @Override
            public void run() {
                System.out.println("Hello kajal");
            }
        };
        static Runnable lr = () -> {
            System.out.println("Using lambda hello kajal");

        };
    public static void main(String[] args) {
        System.out.println("hello");
        r.run();
        lr.run();
    }
}
