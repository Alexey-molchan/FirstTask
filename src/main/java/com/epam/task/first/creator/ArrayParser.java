package com.epam.task.first.creator;

import com.epam.task.first.entities.Array;

public class ArrayParser {


    public Array create(String data){
        String[] arrstr = data.split(",");
        Integer[] arr = new Integer[arrstr.length];
        for (int i = 0; i < arrstr.length; i++){
            arr[i] = Integer.parseInt(arrstr[i],10);
        }

        return new Array(arr);
    }

}
