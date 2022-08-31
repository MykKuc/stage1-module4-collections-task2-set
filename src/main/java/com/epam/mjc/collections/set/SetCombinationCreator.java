package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {


        Set<String> setThatContainsAllElementsFromFirstAndSecondAndNotThird = new HashSet<>();
        setThatContainsAllElementsFromFirstAndSecondAndNotThird = firstSet;
        setThatContainsAllElementsFromFirstAndSecondAndNotThird.retainAll(secondSet);
        setThatContainsAllElementsFromFirstAndSecondAndNotThird.removeAll(thirdSet);




        Set<String> theSet = new HashSet<>(thirdSet);
        theSet.remove("Collections");
        theSet.remove("Iterable");


        Set<String> finalSet = new HashSet<>(setThatContainsAllElementsFromFirstAndSecondAndNotThird);
        finalSet.addAll(theSet);
        finalSet.remove("Comparator");
        finalSet.remove("Java");

        System.out.println(theSet);

        return finalSet;
    }
}
