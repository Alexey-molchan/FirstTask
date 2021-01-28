package com.epam.task.first.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {


    public List<String> readData(String filename) throws DataExсeption {

        List<String> strings = new ArrayList<>();

        try(FileReader reader = new FileReader(filename)) {
            BufferedReader bufferedReader = new BufferedReader(reader);

            String str;
            while ((str = bufferedReader.readLine()) != null ){
                strings.add(str);
            }
        } catch (IOException e){
            throw new DataExсeption(e.getMessage(), e);
        }
        return strings;

    }

}
