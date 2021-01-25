package com.epam.task.first;

import com.epam.task.first.creator.ArrayParser;
import com.epam.task.first.data.DataExсeption;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import com.epam.task.first.creator.ArrayValidator;
import com.epam.task.first.logic.ArrayLogic;

import java.util.ArrayList;
import java.util.List;

public class ArrayCreator {

    private DataReader dataReader;
    private ArrayValidator validator;
    private ArrayParser parser;
    private ArrayLogic arrayLogic;

    public ArrayCreator(DataReader dataReader, ArrayValidator validator, ArrayParser parser) {
        this.dataReader = dataReader;
        this.validator = validator;
        this.parser = parser;
    }


    public List<Array> process(String filename) throws DataExсeption {

        List<Array> col = new ArrayList<>();
        List<String> data = dataReader.readData(filename);
        for (String s : data) {

            if (validator.validate(s)) {
                Array arr = parser.create(s);
                arrayLogic.arraySort(arr);
                col.add(arr);
            }

        }
        return col;
    }
}
