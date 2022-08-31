package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator  {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {

        TreeSet<Integer> myTreeSet = new TreeSet<>();

        for(int i = 0;i < sourceList.size();i++){
            myTreeSet.add(sourceList.get(i)*sourceList.get(i));
        }


          return myTreeSet.subSet(lowerBound,true,upperBound,true);

    }
}
