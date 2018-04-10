package com.irast.algorithms.functional.module2.flatMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {


    public static void main(String[] args) {

        try {
            Stream<String> firstFile = extractFile("first.txt");
            Stream<String> secondFile = extractFile("second.txt");

            Stream<Stream<String>> streamStream = Stream.of(firstFile, secondFile);
            Function<String, Stream<String>> splitIntoWords = line -> Stream.of(line.split(" "));
            Function<String, Stream<String>> splitIntoWords2 = line -> Pattern.compile(" ").splitAsStream(line);
            Map<String, Integer> map = streamStream.flatMap(Function.identity()).flatMap(splitIntoWords).collect(Collectors.toMap(Function.identity(), (s) -> 1,
                    (oldVal, newVal) -> Integer.valueOf(oldVal) + 1, LinkedHashMap::new));
            map.forEach((key, val) -> System.out.println((key) + "->" + val));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Stream<String> extractFile(String input) throws IOException {
        Path path = Paths.get(input);
        return Files.lines(path);
    }
}
