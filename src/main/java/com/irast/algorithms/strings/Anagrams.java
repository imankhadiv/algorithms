package com.irast.algorithms.strings;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Anagrams {

    public List<String> sortBasedOnAnagrams(List<String> input) {

        Comparator<String> comparator = (s1, s2) -> sortChars(s1).compareTo(sortChars(s2));
        input.sort(comparator);
        return input;
    }

    private static String sortChars(String input) {

        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }

    public List<String> sortBaseOnAnagrams2(List<String> input) {

        List<String> finalList = new ArrayList<>();
        Map<String, List<String>> map =
                input.stream().collect(Collectors.groupingBy(Anagrams::sortChars, Collectors.toList()));

        Supplier<Map<String, Set<String>>> supplier = () -> {
            System.out.println("suplier");
            return new LinkedHashMap<>();
        };

        Map<String, Set<String>> map3 =
                input.stream().collect(Collectors.groupingBy(Anagrams::sortChars, supplier, Collectors.toSet()));


        Map<String, Long> map2 =
                input.stream().collect(Collectors.groupingBy(Anagrams::sortChars, Collectors.counting()));

        finalList =
                input.stream().map(Anagrams::sortChars).collect(Collectors.toCollection(LinkedList::new));
        return finalList;
    }

    // third approach!
    public List<String> sortBaseOnAnagrams3(List<String> input) {

        Map<String, List<String>> map = new LinkedHashMap<>();
        input.forEach(item -> {
            map.compute(sortChars(item), (key, val) -> {
                List<String> linkedList = val == null ? new LinkedList<>() : val;
                linkedList.add(item);
                return linkedList;
            });
        });
        List<String> sorted = new ArrayList<>();
        map.forEach((key, val) -> {
            sorted.addAll(val);
        });
        return sorted;
    }

}
