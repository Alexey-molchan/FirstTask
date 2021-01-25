package com.epam.task.first.logic;

import com.epam.task.first.ArrayCreator;
import com.epam.task.first.creator.ArrayParser;
import com.epam.task.first.creator.ArrayValidator;
import com.epam.task.first.data.DataExсeption;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class ArrayCreatorTest {

    private final static List<String> TEST_DATA = Arrays.asList("1 2 3", "3g 4 6");
    private final static String TEST_VALIDATION = ("1 2 3");
//    private final static List<Integer> TEST_PARSER =


    @Test
    public void testProcess() throws DataExсeption {

        DataReader reader = Mockito.mock(DataReader.class);
        when(reader.readData(anyString())).thenReturn(TEST_DATA);

        ArrayValidator validator = Mockito.mock(ArrayValidator.class);
        when(validator.validate(anyString())).thenReturn(Boolean.valueOf(TEST_VALIDATION));

        ArrayParser arrayParser = Mockito.mock(ArrayParser.class);
//        when(arrayParser.create(anyString())).thenReturn()

        ArrayCreator director = new ArrayCreator(reader, validator, arrayParser);
    }

}
