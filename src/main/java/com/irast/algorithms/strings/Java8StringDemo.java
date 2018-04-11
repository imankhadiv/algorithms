package com.irast.algorithms.strings;

import java.util.StringJoiner;

public class Java8StringDemo {

    public static void main(String[] args) {

        String s = "hello world!";
        s.chars().mapToObj(letter -> (char) letter).map(Character::toUpperCase
        ).forEach(System.out::print);

        System.out.println(s.hashCode());
        s += "!!";
        System.out.println(s.hashCode());
        System.out.println(s);

        StringBuilder stringBuilder = new StringBuilder("hello");
        stringBuilder.insert(0, "word!");
        System.out.println(stringBuilder.toString());

        StringJoiner stringJoiner = new StringJoiner(",", "{", "}");
        stringJoiner.add("a");
        stringJoiner.add("b");
        stringJoiner.add("3");

        System.out.println(stringJoiner.toString());
    }
}
