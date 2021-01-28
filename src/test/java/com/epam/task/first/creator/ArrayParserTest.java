package com.epam.task.first.creator;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

public class ArrayParserTest {

    private ArrayParser parser = new ArrayParser();

    @Test(expected = NumberFormatException.class)
    public void testArrayParserWhenNoEmptyLineApplied() {

        String testData = "1g,2,3";
        Array expectedArray = new Array(1,2,3);

        Array actualArray = parser.create(testData);

        Assert.assertEquals(expectedArray, actualArray);

    }

    @Test
    public void testArrayParserWhenLineApplied() {

        String testData = "1,2,3";
        Array expectedArray = new Array(1, 2, 3);

        Array actualArray = parser.create(testData);

        Assert.assertEquals(expectedArray, actualArray);

    }


}
