package com.irast.algorithms.functional;

import java.util.Spliterator;
import java.util.function.Consumer;

public class PersonSpliterator implements Spliterator<Person> {
    Spliterator<String> lineSpliterator;
    private String name;
    private int age;
    private String country;

    public PersonSpliterator(Spliterator<String> lineSpliterator) {
        this.lineSpliterator = lineSpliterator;
    }

    @Override
    public boolean tryAdvance(Consumer<? super Person> action) {
        if (lineSpliterator.tryAdvance(name -> this.name = name) && lineSpliterator.tryAdvance(age -> this.age = Integer.parseInt(age)) &&
                lineSpliterator.tryAdvance(country -> this.country = country)) {
            Person p = new Person(name, age, country);
            action.accept(p);
            return true;
        }
        return false;


    }

    @Override
    public Spliterator<Person> trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        return lineSpliterator.estimateSize() / 3;
    }

    @Override
    public int characteristics() {
        return lineSpliterator.characteristics();
    }
}
