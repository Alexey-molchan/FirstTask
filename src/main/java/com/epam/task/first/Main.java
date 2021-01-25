package com.epam.task.first;

import com.epam.task.first.creator.ArrayParser;
import com.epam.task.first.creator.ArrayValidator;
import com.epam.task.first.data.DataExсeption;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import com.epam.task.first.view.ArrayPrinter;
import com.epam.task.first.view.ConsoleArrayPrinter;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws DataExсeption {

//        Array array = new Array(1, 2, 3);
//
        ArrayPrinter printer = new ConsoleArrayPrinter();
//        printer.print(array);
        ArrayParser arrayParser = new ArrayParser();
        ArrayValidator arrayValidator = new ArrayValidator();
        DataReader reader = new DataReader();

        ArrayCreator arrayCreator = new ArrayCreator(reader, arrayValidator, arrayParser);
        for (Array a : arrayCreator.process("D:\\Example.txt")){
            printer.print(a);
            System.out.println(" ");
        }

    }
}
