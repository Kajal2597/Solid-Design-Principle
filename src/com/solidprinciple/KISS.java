package com.solidprinciple;

public class KISS {
    public static void main(String[] args) {

int age = 0;
        // Complex code violating KISS
        boolean isStudent = false;
        if (age >= 18) {
            if (!isStudent) {
                // logic 
            }
        }

// Simplified to follow KISS
        if (age >= 18 && !isStudent) {
            // logic
        }

    }
}