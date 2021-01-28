package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.List;

public class ArraySorter {

    private void swap(List<Integer> elements, int firstIndex, int secondIndex){
        int temp = elements.get(firstIndex);
        int elementsToReplace = elements.get(secondIndex);
        elements.set(firstIndex, elementsToReplace);
        elements.set(secondIndex, temp);
    }

    public Array bubbleSort(Array array){
        List<Integer> elements = array.getElements();
        int size = elements.size();
        for (int i = size; i > 0; --i){
            for (int j = 0;j < (i - 1); ++j ){
                int firstElement = elements.get(j);
                int secondElement = elements.get(j + 1);
                if (firstElement > secondElement){
                    swap(elements, j, (j + 1));
                }
            }
        }
        return new Array(elements);
    }

}
