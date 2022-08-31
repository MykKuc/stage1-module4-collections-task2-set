package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {

        HashSet<Integer> myHashSet = new HashSet<>();

        for(int i = 0; i < sourceList.size();i++){
            if(sourceList.get(i) % 2 == 0){
                int y = sourceList.get(i);
                myHashSet.add(y);
                while(y % 2 ==0){
                    y = y/2;
                    myHashSet.add(y);
                }

            } else if(sourceList.get(i) % 2 != 0){
                myHashSet.add(sourceList.get(i));
                myHashSet.add(sourceList.get(i)*2);

            }

        }
        return myHashSet;
    }
}
