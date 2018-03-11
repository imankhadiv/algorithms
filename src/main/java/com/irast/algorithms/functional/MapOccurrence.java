package com.irast.algorithms.functional;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapOccurrence {


    public Map<Integer, Integer> convertArrayToMapUsingMappingCollectors(int[] input) {

        Map<Integer, Integer> map = Arrays.stream(input).boxed().collect(Collectors.toMap(Function.identity(), (val) -> 1, Integer::sum, TreeMap::new));
        System.out.println("convert using mapping collectors" + map);
        return map;
    }

    public Map<Integer, Integer> convertArrayToMapUsingGroupingCollectors(int[] input) {

        Map<Integer, Integer> map = Arrays.stream(input).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt((arg) -> 1)));
        System.out.println("convert using grouping collectors" + map);
        return map;
    }

    public Map<Integer, Integer> convertArrayToMapUsingMerging(int[] input) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : input) {
            map.merge(i, 1, (oldVal, newVal) -> oldVal + 1);
        }
        System.out.println("convert using merging" + map);
        return map;
    }

    public Map<Integer, Integer> convertArrayToMapUsingComputing(int[] input) {

        Map<Integer, Integer> map = new TreeMap<>();
        BinaryOperator<Integer> binaryOperator = (key, val) -> val == null ? 1 : val + 1;
        for (int item : input) {
            map.compute(item, binaryOperator);
        }
        System.out.println("convert using computing" + map);
        return map;
    }

}
