package com.selfpractice;

import java.util.function.Predicate;

public class predicate {
    public static void main(String[] args) {


        Predicate<String> isstart = (n) -> n.startsWith("k");

        System.out.println(isstart.test("kajal")); // true
        System.out.println(isstart.test("shreya")); // false

    }}