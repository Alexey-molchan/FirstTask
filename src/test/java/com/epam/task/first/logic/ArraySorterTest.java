package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

public class ArraySorterTest {

    private ArraySorter sorter;
    private Array TEST_ARRAY = new Array(3, 4, -5, 6);
    private Array expectedArray = new Array(-5, 3, 4, 6);


    @Test
    public void testBubbleSort(){

         sorter = new ArraySorter();

         sorter.bubbleSort(TEST_ARRAY);

        Assert.assertEquals(expectedArray, TEST_ARRAY);
    }
}
