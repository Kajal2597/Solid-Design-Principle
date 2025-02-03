package com.Workshop2;


    //custom exception
    class TypeErrorExpection extends Exception {
        public TypeErrorExpection(String message) {
            super(message);
        }

        }

        public class CustomException {
    public static void validatetype(String name)throws TypeErrorExpection
    {
        String String = "kajal";
        if (name==String)
        {
            throw new TypeErrorExpection("string not");
        }
        else {
            System.out.println("valid ");
        }
        
    }
    public static void main(String[] args) {
        try {
            validatetype("kajal");

        } catch (TypeErrorExpection e) {
            System.out.println("Exception " + e.getMessage());
        }

    }}