package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SetCombinationCreator setCombinationCreator = new SetCombinationCreator();





        Set<String> firstSet =  new HashSet<>(Set.of("Java", "SortedSet", "Map", "Collections", "Iterable", "Set", "NavigableSet"));
        Set<String> secondSet =  new HashSet<>(Set.of("Queue", "SortedSet", "NavigableSet", "List", "Set", "Iterator", "Comparator"));
        Set<String> thirdSet =    new HashSet<>(Set.of("TreeSet", "HashSet", "LinkedHashSet", "Collections", "Iterable"));
        // What is needed: Set.of("SortedSet", "NavigableSet", "Set", "TreeSet", "HashSet", "LinkedHashSet"))
        setCombinationCreator.createSetCombination(firstSet,secondSet,thirdSet);
    }
}
