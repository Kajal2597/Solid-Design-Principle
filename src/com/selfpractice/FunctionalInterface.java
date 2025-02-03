package com.selfpractice;

public class FunctionalInterface {
    public static void main(String[] args) {

        interface MyInterface {
            void display();
        }
        MyInterface obj = () -> System.out.println("display method");
        obj.display();
    }
}