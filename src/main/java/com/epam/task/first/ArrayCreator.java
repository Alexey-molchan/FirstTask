package com.epam.task.first;

import com.epam.task.first.creator.ArrayParser;
import com.epam.task.first.data.DataExсeption;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import com.epam.task.first.creator.ArrayValidator;
import com.epam.task.first.logic.ArraySorter;

import java.util.ArrayList;
import java.util.List;

public class ArrayCreator {

    private DataReader dataReader;
    private ArrayValidator validator;
    private ArrayParser parser;


    public ArrayCreator(DataReader dataReader, ArrayValidator validator, ArrayParser parser) {
        this.dataReader = dataReader;
        this.validator = validator;
        this.parser = parser;
    }


//    public List<Array> process(String filename) throws DataExсeption {
//        ArraySorter sorter = new ArraySorter();
//
//        List<Array> col = new ArrayList<>();
//        List<String> data = dataReader.readData(filename);
//        for (String s : data) {
//
//            if (validator.validate(s)) {
//                Array arr = parser.create(s);
//                col.add(sorter.bubbleSort(arr));
//            }
//
//        }
//        return col;
//    }
    public Array process(String filename) throws DataExсeption{

        List<String> data = dataReader.readData(filename);
        String dataLine = "";

        for (String line : data){
            if (validator.validate(line)){
                dataLine += " " + line;
            }
        }
        Array array = parser.create(dataLine);
        return array;


    }
}
