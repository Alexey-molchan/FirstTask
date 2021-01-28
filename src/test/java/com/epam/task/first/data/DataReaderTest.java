package com.epam.task.first.data;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DataReaderTest {

    private final static String TEST_DATA = "D:\\Example.txt";
    private DataReader reader = new DataReader();

    @Test
    public void testDataReader() throws DataExсeption {

        List<String> expected = new ArrayList<>();
        expected.add("3,2,1");
        expected.add("3,4,5");
        expected.add("4g,5,6");

        List<String> actual = reader.readData(TEST_DATA);

        Assert.assertEquals(expected, actual);
    }

}
