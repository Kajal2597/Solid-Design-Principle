package com.stack;

public class Generic {



    public static void disp(int[] arr){
        for(int val : arr){
            System.out.println("integer values :" +val);
        }
    }

    public static void dispchar(char[] arr1){
        for(char values : arr1){
            System.out.println("character values "+values);
        }
    }

    //with generics <Integer>,<String>

    public static <E> void disval(E[] arr){
        for(E values : arr){
            System.out.println("character values "+values);
        }
    }
    public static void main(String[] args) {

        Integer[] intarray ={1,2,3,4,5};
        Character[] chararray = {'a','b','c','d'};
        disval(intarray);
        disval(chararray);
}
}