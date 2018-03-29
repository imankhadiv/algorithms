package com.irast.algorithms.functional;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class VoteWinner {


    public Map<String, Integer> findTheWinner(Map<String, Integer> votes) {


        Comparator<Map.Entry<String, Integer>> comparator = Comparator.comparingInt((ToIntFunction<Map.Entry<String, Integer>>) Map.Entry::getValue).thenComparing(Map.Entry::getKey);
        BinaryOperator<Integer> binaryOperator = Integer::max;
        Map<String, Integer> winnerMap = votes.entrySet().stream().sorted(comparator.reversed()).limit(1).collect(
                Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, binaryOperator, LinkedHashMap::new));
        System.out.println(winnerMap);
        return winnerMap;

    }

    public Map.Entry<String, Integer> findTheWinnerWithoutFunctional(Map<String, Integer> votes) {


        Comparator<Map.Entry<String, Integer>> comparator = (entry1, entry2) -> {
            int val = Integer.compare(entry1.getValue(), entry2.getValue());
            if (val == 0) {
                val = entry1.getKey().compareTo(entry2.getKey());
            }
            return val;
        };
        TreeSet<Map.Entry<String, Integer>> entrySet = new TreeSet<>(comparator.reversed());
        entrySet.addAll(votes.entrySet());
        Map.Entry<String, Integer> winner = entrySet.iterator().next();
        return winner;
    }

    public Map.Entry<String, Integer> findTheWinnerFromMap(Map<String, Integer> map) {

        Optional<Map.Entry<String, Integer>> optional = map.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue));
        return optional.get();
    }
}
