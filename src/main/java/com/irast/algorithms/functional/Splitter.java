package com.irast.algorithms.functional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

class Person {
    String name;
    int age;
    String country;

    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}

public class Splitter {

    public static void extractFile() {

        Path path = Paths.get("people.txt");
        try (Stream<String> lines = Files.lines(path)) {
            Spliterator<String> lineSpliterator = lines.spliterator();
            Spliterator<Person> personSpliterator = new PersonSpliterator(lineSpliterator);
            Stream<Person> personStream = StreamSupport.stream(personSpliterator, false);
            System.out.println("....................");
            personStream.forEach(System.out::println);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        extractFile();
    }


}
