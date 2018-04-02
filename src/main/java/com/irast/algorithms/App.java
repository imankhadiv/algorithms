package com.irast.algorithms;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.ToIntFunction;

/**
 * Hello world!
 */
public class App {
    private String s;
    private int c;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Map<String, Integer> map = new HashMap<>();
        map.put("first", 10);
        map.put("a", 1);
        map.put("b", 200);
        map.put("z", 200);
        map.put("abc", 2);
        map.put("Dabc", 20);
        map.put("DZbc", 20);

        Comparator<Map.Entry<String, Integer>> comparable = Comparator.comparingInt((ToIntFunction<Map.Entry<String, Integer>>) Map.Entry::getValue).thenComparing(Map.Entry::getKey);
        Optional<Map.Entry<String, Integer>> optional = map.entrySet().stream().max(comparable);
        System.out.println(optional);
    }
}
