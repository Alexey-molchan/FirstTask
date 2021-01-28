package com.epam.task.first;

import com.epam.task.first.ArrayCreator;
import com.epam.task.first.creator.ArrayParser;
import com.epam.task.first.creator.ArrayValidator;
import com.epam.task.first.data.DataExсeption;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class ArrayCreatorTest {

    private final static List<String> TEST_DATA = Arrays.asList("1,2,3", "3,4,6");
    private final static Array TEST_ARRAY = new Array (1,2,3);



    @Test
    public void testProcess() throws DataExсeption {

        DataReader reader = Mockito.mock(DataReader.class);
        when(reader.readData(anyString())).thenReturn(TEST_DATA);

        ArrayValidator validator = Mockito.mock(ArrayValidator.class);
        when(validator.validate(anyString())).thenReturn(true);

        ArrayParser arrayParser = Mockito.mock(ArrayParser.class);
        when(arrayParser.create(anyString())).thenReturn(TEST_ARRAY);

        ArrayCreator arrayCreator = new ArrayCreator(reader, validator, arrayParser);

        Array actualArray = arrayCreator.process("SomeFilePath");

        Assert.assertEquals(TEST_ARRAY, actualArray);


    }

}

