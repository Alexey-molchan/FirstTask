package com.epam.task.first.creator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayValidator {

    public boolean validate(String line){
        try {
            String[] arrstr = line.split(",");
            if (arrstr.length == 0){
                return false;
            }
            for (int i = 0; i < arrstr.length; i++){
                Integer.parseInt(arrstr[i],10);
            }
        } catch (Exception e){
            return false;
        }

        return true;

    }

}
