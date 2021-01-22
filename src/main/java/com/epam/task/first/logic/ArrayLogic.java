package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.List;

public class ArrayLogic {

    public int findMax(Array array) {
        if (array.getElements().size() == 0) {
            throw new IllegalArgumentException("Array does not exist");
        }
        List<Integer> elements = array.getElements();
        int max = elements.get(0);
        for (int element : array.getElements()) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public int findMin(Array array) {
        if (array.getElements().size() == 0) {
            throw new IllegalArgumentException("Array does not exist");
        }
        List<Integer> elements = array.getElements();
        int min = elements.get(0);
        for (int element : array.getElements()) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public int findAverage(Array array) {
        if (array.getElements().size() == 0) {
            throw new IllegalArgumentException("Array does not exist");
        }
        int sum = 0;
        for (int element : array.getElements()) {
            sum += element;
        }
        return sum / array.getElements().size();
    }

    public int findSum(Array array) {
        if (array.getElements().size() == 0) {
            throw new IllegalArgumentException("Array does not exist");
        }
        int sum = 0;
        for (int element : array.getElements()) {
            sum += element;
        }
        return sum;
    }

    public int findCountPositiveElements(Array array) {
        if (array.getElements().size() == 0) {
            throw new IllegalArgumentException("Array does not exist");
        }
        int count = 0;
        for (int element : array.getElements()) {
            if (element > 0) {
                count++;
            }
        }
        return count;
    }

    public int findCountNegativeElements(Array array) {
        if (array.getElements().size() == 0) {
            throw new IllegalArgumentException("Array does not exist");
        }
        int count = 0;
        for (int element : array.getElements()) {
            if (element < 0) {
                count++;
            }
        }
        return count;
    }

    public int[] dividesAnEvenNumberByTwo(Array array) {
        List<Integer> elements = array.getElements();
        if (elements.size() == 0) {
            throw new IllegalArgumentException("Array does not exist");
        }

        int index = 0;
        int[] arr = new int[elements.size()];
        for (int el : elements) {
            if (el % 2 == 0) {
                arr[index] = el / 2;
            } else {
                arr[index] = el;
            }
            index++;
        }

        return arr;
    }
}
